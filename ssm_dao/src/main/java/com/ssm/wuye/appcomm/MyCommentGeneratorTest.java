package com.ssm.wuye.appcomm;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;
import org.springframework.util.ResourceUtils;

/**
 *
 */
public class MyCommentGeneratorTest {
	/*public static void main(String[] args) {
		args = new String[] { "-configfile", "resources\\mybatis-generator-config.xml", "-overwrite" };
		
		ShellRunner.main(args);
		System.out.println(" 生在默认的src 的路径 下..................................... ");
	}
*/
     // 这两个main方法都可以执行生成JavaEntity不过喜欢上面那个简洁的方法
	public static void main(String[] args) throws Exception {
		File configFile = ResourceUtils.getFile("classpath:mybatis-generator-config.xml");
		List<String> warnings = new ArrayList<String>();
		ConfigurationParser cp = new ConfigurationParser(warnings);
		Configuration config = cp.parseConfiguration(configFile);
		DefaultShellCallback callback = new DefaultShellCallback(true);
		MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config, callback, warnings);
		myBatisGenerator.generate(null);
		System.out.println(" 多模块下的生成是默认的项目 src路径下 ");
		System.out.println( "  end.......................... ");
	}
}