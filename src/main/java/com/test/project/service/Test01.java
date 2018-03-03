/**
 * 
 */
package com.test.project.service;

/**
 * @description:
 *
 * @author guozh
 * @date 2018年2月26日上午9:39:34
 * 
 */
public class Test01 {

	public static void main(String[] args) {
		System.out.println(10 | 15);
		System.out.println(10 & 15);
		System.out.println(10 ^ 15);
		// 位移运算符 a<<b,a>>b
		System.out.println(1 << 2);
		System.out.println(16 >> 2);
		// 取反运算符 ~a 正数取反一定是负数，反之亦然
		System.out.println(~10);
		System.out.println(~-6);
		System.out.println(~0);
		
		// DELIMITER //
		// CREATE PROCEDURE handledemo2()
		// BEGIN
		// DECLARE CONTINUE HANDLER FOR SQLSTATE '23000' SET @x2 =1;
		// SET @x = 1;
		// INSERT INTO mydata.tb_3 VALUES(1);
		// set @x = 2;
		// INSERT INTO mydata.tb_3 VALUES(1);
		// SET @x = 3;
		// END;
		// //
		 
		// DELIMITER //
		// CREATE PROCEDURE add_id (out count INT)
		// BEGIN
		// DECLARE itmp INT;
		// DECLARE cur_id CURSOR FOR SELECT id FROM sch;
		// DECLARE EXIT HANDLER FOR NOT FOUND CLOSE cur_id;
		// SELECT count_sch() INTO count;
		// SET @sum =0;
		// OPEN cur_id;
		// REPEAT
		// FETCH cur_id INTO itmp;
		// IF itmp<10
		// THEN SET @sum= @sum+itmp;
		// END IF;
		// UNTIL 0 END REPEAT;
		// CLOSE cur_id;
		// END //
		// DELIMITER ;

		String name_took_tt = "yuyuyu";

		System.out.println(name_took_tt);
	}

}
