package com.alibaba.datax.example.txtfile;

import com.alibaba.datax.example.ExampleContainer;
import com.alibaba.datax.example.util.PathUtil;
import org.junit.Test;

/**
 * {@code Author} FuYouJ
 * {@code Date} 2023/8/14 20:16
 */

public class TxtfileTest {
    @Test
    public void testTxtfile2Stream() {
        String path = "/txtfile2stream.json";
        String jobPath = PathUtil.getAbsolutePathFromClassPath(path);
        ExampleContainer.start(jobPath);
    }
    
    @Test
    public void testCsvfile2Stream() {
        String path = "/csvfile2stream.json";
        String jobPath = PathUtil.getAbsolutePathFromClassPath(path);
        ExampleContainer.start(jobPath);
    }
    
    @Test
    public void testTxtfile2Mysql() {
        String path = "/txtfile2mysql.json";
        String jobPath = PathUtil.getAbsolutePathFromClassPath(path);
        ExampleContainer.start(jobPath);
    }
    
    @Test
    public void testCsvfile2Mysql() {
        String path = "/csvfile2mysql.json";
        String jobPath = PathUtil.getAbsolutePathFromClassPath(path);
        ExampleContainer.start(jobPath);
    }
    
}
