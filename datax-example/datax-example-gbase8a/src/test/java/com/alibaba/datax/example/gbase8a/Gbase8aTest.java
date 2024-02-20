package com.alibaba.datax.example.gbase8a;

import com.alibaba.datax.example.ExampleContainer;
import com.alibaba.datax.example.util.PathUtil;
import org.junit.Test;

/**
 * {@code Author} FuYouJ
 * {@code Date} 2023/8/14 20:16
 */

public class Gbase8aTest {

    @Test
    public void testMysql2Gbase8a() {
        String path = "/mysql2gbase8a.json";
        String jobPath = PathUtil.getAbsolutePathFromClassPath(path);
        ExampleContainer.start(jobPath);
    }

    @Test
    public void testGbase8a2Mysql() {
        String path = "/gbase8a2mysql.json";
        String jobPath = PathUtil.getAbsolutePathFromClassPath(path);
        ExampleContainer.start(jobPath);
    }
}
