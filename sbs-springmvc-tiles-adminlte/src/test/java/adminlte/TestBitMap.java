/**
 * Project Name:adminlte
 * File Name:TestBitMap.java
 * Package Name:adminlte
 * Date:2017年8月24日上午8:56:50
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

package adminlte;

import java.util.BitSet;

import static org.junit.Assert.assertTrue;
import org.junit.Test;


/**
 * Description:   <br/>
 * Date:     2017年8月24日 上午8:56:50 <br/>
 * @author   junwen.bao@airintelli.com
 * @version
 * @see
 */
public class TestBitMap {

    @Test
    public void test() {
        BitSet bs = new BitSet();
        bs.set(1);
        assertTrue(bs.get(1));
    }

}

