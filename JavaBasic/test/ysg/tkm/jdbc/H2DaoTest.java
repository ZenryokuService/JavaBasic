/**
 * Copyright (c) 2019-present ProconServerRPG JavaFX Library All rights reserved.
 * 
 * Redistribution and use in source and binary forms, with or without modification, are permitted provided that the following conditions are met:
 * Redistributions of source code must retain the above copyright notice, this list of conditions and the following disclaimer.
 * Redistributions in binary form must reproduce the above copyright notice, this list of conditions and the following disclaimer in the documentation and/or other materials provided with the distribution.
 * Neither the name ProconServerRPG JavaFX Library nor the names of its contributors may be used to endorse or promote products derived from this software without specific prior written permission.
 */
package ysg.tkm.jdbc;

import static org.junit.Assert.fail;

import java.sql.SQLException;

import org.junit.Test;

/**
 *
 * @author 作成者の名前
 * 2021/05/31
 */
public class H2DaoTest {

	@Test
	public void testConstractor() {
		try {
			H2Dao dao = new H2Dao();
		} catch (SQLException e) {
			fail("エラーになりました");
		}
		
	}
}
