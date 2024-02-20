package com.alibaba.datax.example.gaussdb;

import com.alibaba.datax.example.ExampleContainer;
import com.alibaba.datax.example.util.PathUtil;
import org.junit.Test;

/**
 * {@code Author} FuYouJ
 * {@code Date} 2023/8/14 20:16
 */

public class GaussdbTest {
    @Test
    public void testMysql2Oralce() {
        String path = "/mysql2oracle.json";
        String jobPath = PathUtil.getAbsolutePathFromClassPath(path);
        ExampleContainer.start(jobPath);
    }
    
    @Test
    public void testOracle2Gaussdb() {
        String path = "/oracle2gaussdb.json";
        String jobPath = PathUtil.getAbsolutePathFromClassPath(path);
        ExampleContainer.start(jobPath);
    }
    
    @Test
    public void testMysql2Gaussdb() {
        String path = "/mysql2gaussdb.json";
        String jobPath = PathUtil.getAbsolutePathFromClassPath(path);
        ExampleContainer.start(jobPath);
    }
    
    @Test
    public void testGaussdb2Mysql() {
        String path = "/gaussdb2mysql.json";
        String jobPath = PathUtil.getAbsolutePathFromClassPath(path);
        ExampleContainer.start(jobPath);
    }
    
}
