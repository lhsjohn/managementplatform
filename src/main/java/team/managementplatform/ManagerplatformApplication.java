package team.managementplatform;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
//扫描mybatis mapper包路径
@MapperScan(basePackages = "team.managerplatform.mapper")
public class ManagerplatformApplication {

	public static void main(String[] args) {
		SpringApplication.run(ManagerplatformApplication.class, args);
	}
}
