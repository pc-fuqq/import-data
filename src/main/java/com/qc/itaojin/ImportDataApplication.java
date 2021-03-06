package com.qc.itaojin;

import com.qc.itaojin.enums.BizType;
import com.qc.itaojin.listener.ImportListener;
import com.qc.itaojin.listener.InitListener;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ImportDataApplication {

    /**
     * 物理schema
     * */
    public static final String SCHEMA = BizType.PAY.code();

    public static void main(String[] args) {
        SpringApplication springApplication = new SpringApplication(ImportDataApplication.class);
//        springApplication.addListeners(new InitListener());
        springApplication.addListeners(new ImportListener());
        springApplication.run(args);
    }
}
