/**
 * Copyright (c) 2000-2013 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.microblogs.service.base;

import com.liferay.microblogs.service.MicroblogsEntryLocalServiceUtil;

import java.util.Arrays;

/**
 * @author Brian Wing Shun Chan
 */
public class MicroblogsEntryLocalServiceClpInvoker {
	public MicroblogsEntryLocalServiceClpInvoker() {
		_methodName0 = "addMicroblogsEntry";

		_methodParameterTypes0 = new String[] {
				"com.liferay.microblogs.model.MicroblogsEntry"
			};

		_methodName1 = "createMicroblogsEntry";

		_methodParameterTypes1 = new String[] { "long" };

		_methodName2 = "deleteMicroblogsEntry";

		_methodParameterTypes2 = new String[] { "long" };

		_methodName3 = "deleteMicroblogsEntry";

		_methodParameterTypes3 = new String[] {
				"com.liferay.microblogs.model.MicroblogsEntry"
			};

		_methodName4 = "dynamicQuery";

		_methodParameterTypes4 = new String[] {  };

		_methodName5 = "dynamicQuery";

		_methodParameterTypes5 = new String[] {
				"com.liferay.portal.kernel.dao.orm.DynamicQuery"
			};

		_methodName6 = "dynamicQuery";

		_methodParameterTypes6 = new String[] {
				"com.liferay.portal.kernel.dao.orm.DynamicQuery", "int", "int"
			};

		_methodName7 = "dynamicQuery";

		_methodParameterTypes7 = new String[] {
				"com.liferay.portal.kernel.dao.orm.DynamicQuery", "int", "int",
				"com.liferay.portal.kernel.util.OrderByComparator"
			};

		_methodName8 = "dynamicQueryCount";

		_methodParameterTypes8 = new String[] {
				"com.liferay.portal.kernel.dao.orm.DynamicQuery"
			};

		_methodName9 = "fetchMicroblogsEntry";

		_methodParameterTypes9 = new String[] { "long" };

		_methodName10 = "getMicroblogsEntry";

		_methodParameterTypes10 = new String[] { "long" };

		_methodName11 = "getPersistedModel";

		_methodParameterTypes11 = new String[] { "java.io.Serializable" };

		_methodName12 = "getMicroblogsEntries";

		_methodParameterTypes12 = new String[] { "int", "int" };

		_methodName13 = "getMicroblogsEntriesCount";

		_methodParameterTypes13 = new String[] {  };

		_methodName14 = "updateMicroblogsEntry";

		_methodParameterTypes14 = new String[] {
				"com.liferay.microblogs.model.MicroblogsEntry"
			};

		_methodName35 = "getBeanIdentifier";

		_methodParameterTypes35 = new String[] {  };

		_methodName36 = "setBeanIdentifier";

		_methodParameterTypes36 = new String[] { "java.lang.String" };

		_methodName41 = "addMicroblogsEntry";

		_methodParameterTypes41 = new String[] {
				"long", "java.lang.String", "int", "long", "long", "int",
				"com.liferay.portal.service.ServiceContext"
			};

		_methodName42 = "deleteMicroblogsEntry";

		_methodParameterTypes42 = new String[] { "long" };

		_methodName43 = "deleteMicroblogsEntry";

		_methodParameterTypes43 = new String[] {
				"com.liferay.microblogs.model.MicroblogsEntry"
			};

		_methodName44 = "deleteUserMicroblogsEntries";

		_methodParameterTypes44 = new String[] { "long" };

		_methodName45 = "getCompanyMicroblogsEntries";

		_methodParameterTypes45 = new String[] { "long", "int", "int" };

		_methodName46 = "getCompanyMicroblogsEntriesCount";

		_methodParameterTypes46 = new String[] { "long" };

		_methodName47 = "getMicroblogsEntry";

		_methodParameterTypes47 = new String[] { "long" };

		_methodName48 = "getReceiverMicroblogsEntryMicroblogsEntries";

		_methodParameterTypes48 = new String[] {
				"int", "long", "int", "int",
				"com.liferay.portal.kernel.util.OrderByComparator"
			};

		_methodName49 = "getReceiverMicroblogsEntryMicroblogsEntriesCount";

		_methodParameterTypes49 = new String[] { "int", "long" };

		_methodName50 = "getReceiverUserMicroblogsEntries";

		_methodParameterTypes50 = new String[] { "int", "long", "int", "int" };

		_methodName51 = "getReceiverUserMicroblogsEntriesCount";

		_methodParameterTypes51 = new String[] { "int", "long" };

		_methodName52 = "getUserMicroblogsEntries";

		_methodParameterTypes52 = new String[] { "long", "int", "int" };

		_methodName53 = "getUserMicroblogsEntries";

		_methodParameterTypes53 = new String[] { "long", "int", "int", "int" };

		_methodName54 = "getUserMicroblogsEntriesCount";

		_methodParameterTypes54 = new String[] { "long" };

		_methodName55 = "getUserMicroblogsEntriesCount";

		_methodParameterTypes55 = new String[] { "long", "int" };

		_methodName56 = "updateAsset";

		_methodParameterTypes56 = new String[] {
				"com.liferay.microblogs.model.MicroblogsEntry", "long[][]",
				"java.lang.String[][]"
			};

		_methodName57 = "updateMicroblogsEntry";

		_methodParameterTypes57 = new String[] {
				"long", "java.lang.String", "int",
				"com.liferay.portal.service.ServiceContext"
			};
	}

	public Object invokeMethod(String name, String[] parameterTypes,
		Object[] arguments) throws Throwable {
		if (_methodName0.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes0, parameterTypes)) {
			return MicroblogsEntryLocalServiceUtil.addMicroblogsEntry((com.liferay.microblogs.model.MicroblogsEntry)arguments[0]);
		}

		if (_methodName1.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes1, parameterTypes)) {
			return MicroblogsEntryLocalServiceUtil.createMicroblogsEntry(((Long)arguments[0]).longValue());
		}

		if (_methodName2.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes2, parameterTypes)) {
			return MicroblogsEntryLocalServiceUtil.deleteMicroblogsEntry(((Long)arguments[0]).longValue());
		}

		if (_methodName3.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes3, parameterTypes)) {
			return MicroblogsEntryLocalServiceUtil.deleteMicroblogsEntry((com.liferay.microblogs.model.MicroblogsEntry)arguments[0]);
		}

		if (_methodName4.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes4, parameterTypes)) {
			return MicroblogsEntryLocalServiceUtil.dynamicQuery();
		}

		if (_methodName5.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes5, parameterTypes)) {
			return MicroblogsEntryLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0]);
		}

		if (_methodName6.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes6, parameterTypes)) {
			return MicroblogsEntryLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0],
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue());
		}

		if (_methodName7.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes7, parameterTypes)) {
			return MicroblogsEntryLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0],
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue(),
				(com.liferay.portal.kernel.util.OrderByComparator)arguments[3]);
		}

		if (_methodName8.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes8, parameterTypes)) {
			return MicroblogsEntryLocalServiceUtil.dynamicQueryCount((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0]);
		}

		if (_methodName9.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes9, parameterTypes)) {
			return MicroblogsEntryLocalServiceUtil.fetchMicroblogsEntry(((Long)arguments[0]).longValue());
		}

		if (_methodName10.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes10, parameterTypes)) {
			return MicroblogsEntryLocalServiceUtil.getMicroblogsEntry(((Long)arguments[0]).longValue());
		}

		if (_methodName11.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes11, parameterTypes)) {
			return MicroblogsEntryLocalServiceUtil.getPersistedModel((java.io.Serializable)arguments[0]);
		}

		if (_methodName12.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes12, parameterTypes)) {
			return MicroblogsEntryLocalServiceUtil.getMicroblogsEntries(((Integer)arguments[0]).intValue(),
				((Integer)arguments[1]).intValue());
		}

		if (_methodName13.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes13, parameterTypes)) {
			return MicroblogsEntryLocalServiceUtil.getMicroblogsEntriesCount();
		}

		if (_methodName14.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes14, parameterTypes)) {
			return MicroblogsEntryLocalServiceUtil.updateMicroblogsEntry((com.liferay.microblogs.model.MicroblogsEntry)arguments[0]);
		}

		if (_methodName35.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes35, parameterTypes)) {
			return MicroblogsEntryLocalServiceUtil.getBeanIdentifier();
		}

		if (_methodName36.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes36, parameterTypes)) {
			MicroblogsEntryLocalServiceUtil.setBeanIdentifier((java.lang.String)arguments[0]);

			return null;
		}

		if (_methodName41.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes41, parameterTypes)) {
			return MicroblogsEntryLocalServiceUtil.addMicroblogsEntry(((Long)arguments[0]).longValue(),
				(java.lang.String)arguments[1],
				((Integer)arguments[2]).intValue(),
				((Long)arguments[3]).longValue(),
				((Long)arguments[4]).longValue(),
				((Integer)arguments[5]).intValue(),
				(com.liferay.portal.service.ServiceContext)arguments[6]);
		}

		if (_methodName42.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes42, parameterTypes)) {
			return MicroblogsEntryLocalServiceUtil.deleteMicroblogsEntry(((Long)arguments[0]).longValue());
		}

		if (_methodName43.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes43, parameterTypes)) {
			return MicroblogsEntryLocalServiceUtil.deleteMicroblogsEntry((com.liferay.microblogs.model.MicroblogsEntry)arguments[0]);
		}

		if (_methodName44.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes44, parameterTypes)) {
			MicroblogsEntryLocalServiceUtil.deleteUserMicroblogsEntries(((Long)arguments[0]).longValue());

			return null;
		}

		if (_methodName45.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes45, parameterTypes)) {
			return MicroblogsEntryLocalServiceUtil.getCompanyMicroblogsEntries(((Long)arguments[0]).longValue(),
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue());
		}

		if (_methodName46.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes46, parameterTypes)) {
			return MicroblogsEntryLocalServiceUtil.getCompanyMicroblogsEntriesCount(((Long)arguments[0]).longValue());
		}

		if (_methodName47.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes47, parameterTypes)) {
			return MicroblogsEntryLocalServiceUtil.getMicroblogsEntry(((Long)arguments[0]).longValue());
		}

		if (_methodName48.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes48, parameterTypes)) {
			return MicroblogsEntryLocalServiceUtil.getReceiverMicroblogsEntryMicroblogsEntries(((Integer)arguments[0]).intValue(),
				((Long)arguments[1]).longValue(),
				((Integer)arguments[2]).intValue(),
				((Integer)arguments[3]).intValue(),
				(com.liferay.portal.kernel.util.OrderByComparator)arguments[4]);
		}

		if (_methodName49.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes49, parameterTypes)) {
			return MicroblogsEntryLocalServiceUtil.getReceiverMicroblogsEntryMicroblogsEntriesCount(((Integer)arguments[0]).intValue(),
				((Long)arguments[1]).longValue());
		}

		if (_methodName50.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes50, parameterTypes)) {
			return MicroblogsEntryLocalServiceUtil.getReceiverUserMicroblogsEntries(((Integer)arguments[0]).intValue(),
				((Long)arguments[1]).longValue(),
				((Integer)arguments[2]).intValue(),
				((Integer)arguments[3]).intValue());
		}

		if (_methodName51.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes51, parameterTypes)) {
			return MicroblogsEntryLocalServiceUtil.getReceiverUserMicroblogsEntriesCount(((Integer)arguments[0]).intValue(),
				((Long)arguments[1]).longValue());
		}

		if (_methodName52.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes52, parameterTypes)) {
			return MicroblogsEntryLocalServiceUtil.getUserMicroblogsEntries(((Long)arguments[0]).longValue(),
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue());
		}

		if (_methodName53.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes53, parameterTypes)) {
			return MicroblogsEntryLocalServiceUtil.getUserMicroblogsEntries(((Long)arguments[0]).longValue(),
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue(),
				((Integer)arguments[3]).intValue());
		}

		if (_methodName54.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes54, parameterTypes)) {
			return MicroblogsEntryLocalServiceUtil.getUserMicroblogsEntriesCount(((Long)arguments[0]).longValue());
		}

		if (_methodName55.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes55, parameterTypes)) {
			return MicroblogsEntryLocalServiceUtil.getUserMicroblogsEntriesCount(((Long)arguments[0]).longValue(),
				((Integer)arguments[1]).intValue());
		}

		if (_methodName56.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes56, parameterTypes)) {
			MicroblogsEntryLocalServiceUtil.updateAsset((com.liferay.microblogs.model.MicroblogsEntry)arguments[0],
				(long[])arguments[1], (java.lang.String[])arguments[2]);

			return null;
		}

		if (_methodName57.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes57, parameterTypes)) {
			return MicroblogsEntryLocalServiceUtil.updateMicroblogsEntry(((Long)arguments[0]).longValue(),
				(java.lang.String)arguments[1],
				((Integer)arguments[2]).intValue(),
				(com.liferay.portal.service.ServiceContext)arguments[3]);
		}

		throw new UnsupportedOperationException();
	}

	private String _methodName0;
	private String[] _methodParameterTypes0;
	private String _methodName1;
	private String[] _methodParameterTypes1;
	private String _methodName2;
	private String[] _methodParameterTypes2;
	private String _methodName3;
	private String[] _methodParameterTypes3;
	private String _methodName4;
	private String[] _methodParameterTypes4;
	private String _methodName5;
	private String[] _methodParameterTypes5;
	private String _methodName6;
	private String[] _methodParameterTypes6;
	private String _methodName7;
	private String[] _methodParameterTypes7;
	private String _methodName8;
	private String[] _methodParameterTypes8;
	private String _methodName9;
	private String[] _methodParameterTypes9;
	private String _methodName10;
	private String[] _methodParameterTypes10;
	private String _methodName11;
	private String[] _methodParameterTypes11;
	private String _methodName12;
	private String[] _methodParameterTypes12;
	private String _methodName13;
	private String[] _methodParameterTypes13;
	private String _methodName14;
	private String[] _methodParameterTypes14;
	private String _methodName35;
	private String[] _methodParameterTypes35;
	private String _methodName36;
	private String[] _methodParameterTypes36;
	private String _methodName41;
	private String[] _methodParameterTypes41;
	private String _methodName42;
	private String[] _methodParameterTypes42;
	private String _methodName43;
	private String[] _methodParameterTypes43;
	private String _methodName44;
	private String[] _methodParameterTypes44;
	private String _methodName45;
	private String[] _methodParameterTypes45;
	private String _methodName46;
	private String[] _methodParameterTypes46;
	private String _methodName47;
	private String[] _methodParameterTypes47;
	private String _methodName48;
	private String[] _methodParameterTypes48;
	private String _methodName49;
	private String[] _methodParameterTypes49;
	private String _methodName50;
	private String[] _methodParameterTypes50;
	private String _methodName51;
	private String[] _methodParameterTypes51;
	private String _methodName52;
	private String[] _methodParameterTypes52;
	private String _methodName53;
	private String[] _methodParameterTypes53;
	private String _methodName54;
	private String[] _methodParameterTypes54;
	private String _methodName55;
	private String[] _methodParameterTypes55;
	private String _methodName56;
	private String[] _methodParameterTypes56;
	private String _methodName57;
	private String[] _methodParameterTypes57;
}