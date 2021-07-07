/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fu.mathutil;

/**
 *
 * @author Tuan
 */
//class cung cấp tiện ích cho nơi khác sài
//khi cung cấp tiện ích cho nơi khác sài, đó là lúc ta ko cần nhớ cái gì đó
//cho riêng ta, hàm STATIC giúp làm điều này
public class MathUtil {
    
    //n! = 1..2.3.4...n
    //quy ước: 0! = 1! = 1
    //ko tính giai thừ cho số âm 
    //20! là vừa khớp kiểu long, kiểu long tối da 18 số 0
    //21! là lố
    //nếu đưa vào âm, 21! thì ko tính ta đập vào mặt ai xài hàm lại
    //một cái ngoại lệ, chửi éo tính 
    public static long getFactorial(int n){
        if(n < 0 || n > 20){
            throw new IllegalArgumentException("Invalid argument. N must be between 0 - 20");
        }
        
        if( n == 0 || n == 1){
            
            return 1;
        }
        
        //xuoosng ddeens ddaay, n = 2..20 ồi
        //chơi for hoặc đệ quy - recursion
        //kĩ thuật nhồi con heo đất
        // i = 2, i = 3, i = n nhồi liên tục i vào tích
        long product = 1;//tich khởi đầu bằng 1, nhồi 2 3 4 5 6 .. n
        for (int i = 2; i <= n; i++) {
            product *= i;
            //product = product * i;
        }
        return product;
    }
}
