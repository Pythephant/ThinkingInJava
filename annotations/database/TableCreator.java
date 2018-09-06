package annotations.database;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public class TableCreator {
	public static void main(String[] args) throws Exception {
		if (args.length < 1) {
			System.out.println("arguments: annoted classes");
			System.exit(-1);
		}

		for (String clsName : args) {
			Class<?> cls = Class.forName(clsName);
			DBTable table = cls.getAnnotation(DBTable.class);
			if (table == null) {
				System.out.println("No DBTable Annotations in class " + clsName);
				continue;
			}
			String tableName = table.tableName();
			if (tableName.length() < 1) {
				tableName = cls.getName().toUpperCase();
			}

			List<String> columnDefines = new ArrayList<>();
			for (Field field : cls.getDeclaredFields()) {
				String columnName = null;
				Annotation[] anns = field.getDeclaredAnnotations();
				if (anns.length < 1)
					continue; // not a column field

				if (anns[0] instanceof SQLInteger) {
					SQLInteger sInt = (SQLInteger) anns[0];
					if (sInt.name().length() < 1) {
						columnName = field.getName().toUpperCase();
					} else {
						columnName = sInt.name();
					}
					columnDefines.add(columnName + " INT" + getConstraints(sInt.constraints()));
				}

				if (anns[0] instanceof SQLString) {
					SQLString sStr = (SQLString) anns[0];
					if (sStr.name().length() < 1) {
						columnName = field.getName().toUpperCase();
					} else {
						columnName = sStr.name();
					}
					columnDefines
							.add(columnName + " VARCHAR(" + sStr.value() + ")" + getConstraints(sStr.constraints()));
				}
				StringBuilder createCommand = new StringBuilder("CREATE TABLE " + tableName + "(");
				for (String colDefine : columnDefines) {
					createCommand.append("\n	" + colDefine + ",");
				}

				String tableCreate = createCommand.substring(0, createCommand.length() - 1) + "\n);";
				System.out.println("Table Create SQL for " + tableName + " is:\n" + tableCreate);
			}
		}
	}

	private static String getConstraints(Constraints con) {
		String constraints = "";
		if (con.allowNull() == false) {
			constraints += " NOT NULL";
		}
		if (con.primaryKey()) {
			constraints += " PRIMARY KEY";
		}
		if (con.isUnique()) {
			constraints += " UNIQUE";
		}
		return constraints;
	}
}
