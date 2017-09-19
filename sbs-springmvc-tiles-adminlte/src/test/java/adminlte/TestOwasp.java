/**
 * Project Name:adminlte
 * File Name:TestOwasp.java
 * Package Name:adminlte
 * Date:2017年8月24日上午10:01:12
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

package adminlte;

import static org.junit.Assert.*;

import org.junit.Test;
import org.owasp.esapi.ESAPI;

/**
 * Description:   <br/>
 * Date:     2017年8月24日 上午10:01:12 <br/>
 * @author   junwen.bao@airintelli.com
 * @version
 * @see
 */
public class TestOwasp {

    @Test
    public void test() {
        String userID= null;
        boolean isValid = ESAPI.validator().isValidInput("user id", userID, "USERID", 20, false);
        assertTrue(isValid);
    }

}

