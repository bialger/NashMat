//package com;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
/*
Version 1.0
by Alexander Bigulov
2018.08.13
*/
class NashMat implements ActionListener {
        //Answers & Exercises Strings
	String an13 = "";
	String ex13 = "";
	String an14 = "";
	String ex14 = "";
	String an15 = "";
	String ex15 = "";
	String an16 = "";
	String ex16 = "";
	String an17 = "";
	String ex17 = "";
	String an18 = "";
	String ex18 = "";
	String an12 = "";
	String ex12 = "";
	String an11 = "";
	String ex11 = "";
	String an10 = "";
	String ex10 = "";
	String an9 = "";
	String ex9 = "";
	String an8 = "";
	String ex8 = "";
	String an7 = "";
	String ex7 = "";
	String an6 = "";
	String ex6 = "";
	String an5 = "";
	String ex5 = "";
	String an4 = "";
	String ex4 = "";
	String an3 = "";
	String ex3 = "";
	String an2 = "";
	String ex2 = "";
	String an1 = "";
	String ex1 = "";
        //Text fields for your answers
	JTextField jtf1 = new JTextField (20);
	JTextField jtf2 = new JTextField (20);
	JTextField jtf3 = new JTextField (20);
	JTextField jtf4 = new JTextField (20);
	JTextField jtf5 = new JTextField (20);
	JTextField jtf6 = new JTextField (20);
	JTextField jtf7 = new JTextField (20);
	JTextField jtf8 = new JTextField (20);
	JTextField jtf9 = new JTextField (20);
	JTextField jtf10 = new JTextField (20);
	JTextField jtf11 = new JTextField (20);
	JTextField jtf12 = new JTextField (20);
	JTextField jtf13 = new JTextField (20);
	JTextField jtf14 = new JTextField (20);
	JTextField jtf15 = new JTextField (20);
	JTextField jtf16 = new JTextField (20);
	JTextField jtf17 = new JTextField (20);
	JTextField jtf18 = new JTextField (20);
        //JLabels for your answers
	JLabel jlabEndRes = new JLabel ("");
	JLabel jlabRes1 = new JLabel ("");
	JLabel jlabRes2 = new JLabel ("");
	JLabel jlabRes3 = new JLabel ("");
	JLabel jlabRes4 = new JLabel ("");
	JLabel jlabRes5 = new JLabel ("");
	JLabel jlabRes6 = new JLabel ("");
	JLabel jlabRes7 = new JLabel ("");
	JLabel jlabRes8 = new JLabel ("");
	JLabel jlabRes9 = new JLabel ("");
	JLabel jlabRes10 = new JLabel ("");
	JLabel jlabRes11 = new JLabel ("");
	JLabel jlabRes12 = new JLabel ("");
	JLabel jlabRes13 = new JLabel ("");
	JLabel jlabRes14 = new JLabel ("");
	JLabel jlabRes15 = new JLabel ("");
	JLabel jlabRes16 = new JLabel ("");
	JLabel jlabRes17 = new JLabel ("");
	JLabel jlabRes18 = new JLabel ("");
	int bb1 = 0;
    int bb2 = 0;
    int bb3 = 0;
    int bb4 = 0;
    int bb5 = 0;
    int bb6 = 0;
    int bb7 = 0;
    int bb8 = 0;
    int bb9 = 0;
    int bb10 = 0;
    int bb11 = 0;
    int bb12 = 0;
    int bb13 = 0;
    int bb14 = 0;
    int bb15 = 0;
    int bb16 = 0;
    int bb17 = 0;
    int bb18 = 0;
//Standart construction for Swing
NashMat(){
        //Exercises
	double var1da = (int)(Math.random()*601 - 300);
	var1da /= 100;
	double var1db = (int)(Math.random()*601 - 300);
	var1db /= 100;
	double an1d =var1da*(1+var1db);
	an1d *= 1000;
	an1d = (int)(an1d);
	an1d /= 1000;
	an1 = Double.toString (an1d);
	var1da *= 100;
	var1db *= 100;
	String var1sa = Double.toString (var1da);
	var1sa += "%";
	String var1sb = Double.toString (var1db);
	var1sb += "%";
	ex1 = var1sa + " + " + var1sb + " = ? Ответ дать в десятичных дробях, 3 знака после запятой.";

	int b2 =(int)(Math.random()*20001 - 10000);
	int c2 =(int)(Math.random()*20001 - 10000);
	int a2 =b2*c2;
	String a2s = Integer.toString(a2);
	String b2s = Integer.toString(b2);
	an2 = Integer.toString(c2);
	ex2 = a2s + " / " + b2s + " = " + "?";
	int c21 =(int)(Math.random()*2001 - 1000);
	int d21 =(int)(Math.random()*20001 - 10000);
	int e21 =(int)(Math.random()*2001 - 1000);
	int a21 = e21*c21*d21;
	String a21s = Integer.toString(a21);
	String c21s = Integer.toString(c21);
	String d21s = Integer.toString(d21);
	an6 = Integer.toString(e21);
	ex6 = a21s + " / (" + c21s + " * " + d21s + ") = ?";

	int d22 =(int)(Math.random()*20001 - 10000);
	int h22 =(int)(Math.random()*201 - 100);
	int b22 =(int)(Math.random()*20001 - 10000);
	int f22 =(int)(Math.random()*201 - 100);
	int an22i =(int)(Math.random()*2001 - 1000);
	int e22 = h22 - f22;
	int g22 = h22 * d22 * an22i;
	int a22 = g22 - b22;
	String a22s = Integer.toString(a22);
	String b22s = Integer.toString(b22);
	String d22s = Integer.toString(d22);
	String e22s = Integer.toString(e22);
	String f22s = Integer.toString(f22);
	String g22s = Integer.toString(g22);
	String h22s = Integer.toString(h22);
	an7 = Integer.toString(an22i);
	ex7 = "(" + a22s + " + " + b22s + ") / " + d22s + "(" + e22s + " + " + f22s + ") = ?";


	int d32 =(int)(Math.random()*20001 - 10000);
	int h32 =(int)(Math.random()*201 - 100);
	int b32 =(int)(Math.random()*20001 - 10000);
	int f32 =(int)(Math.random()*201 - 100);
	int an32i =(int)(Math.random()*2001 - 1000);
	int e32 = h32 - f32;
	int g32 = h32 * d32 * an32i;
	int a32 = g32 - b32;
	String a32s = Integer.toString(a32);
	String b32s = Integer.toString(b32);
	String d32s = Integer.toString(d32);
	String e32s = Integer.toString(e32);
	String f32s = Integer.toString(f32);
	String g32s = Integer.toString(g32);
	String h32s = Integer.toString(h32);
	an3 = Integer.toString(an32i);
	ex3 = "(" + a32s + " + " + b32s + ") / " + d32s + "(" + e32s + " + " + f32s + ") = ?";

	int b4=(int)(Math.random()*16 );
	int a4=(int)(Math.random()*31 - 15);
	int x41 = (-1)*a4 + b4;
	int x42 = (-1)*a4 - b4;
	String x41s = Integer.toString(x41);
	String x42s = Integer.toString(x42);
	String a4s = Integer.toString(a4);
	String b4s = Integer.toString(b4);
	String ex4 = "|" + "x" + " + " + a4s + "| = " + b4s + " Ответ видa A = {x1; x2}";
	if (x41s.equals(x42s)){
	an4 = "A = {" + x41s + "}";
	}else {
	an4 = "A = {"+x41s+"; "+x42s+"}";
	}


	//|aex + (ac)| = ad
	double a5=(int)(Math.random()*15 - 7);
	double c5=(int)(Math.random()*15 - 7);
	double d5=(int)(Math.random()*15 - 7);
	double e5=(int)(Math.random()*15 - 7);
	double x51 = ((-1)*c5 + d5)/e5;
	double x52 = ((-1)*c5 - d5)/e5;
	x51 *= 1000;
	x51 = (int)(x51);
	x51 /= 1000;
	x52 *= 1000;
	x52 = (int)(x52);
	x52 /= 1000;
	String x51s = Double.toString(x51);
	String x52s = Double.toString(x52);
	String a5s = Double.toString(a5*c5);
	String b5s = Double.toString(d5*a5);
	String c5s = Double.toString(a5*e5);
	ex5 = "|" + c5s + "x" + " + " + a5s + "| = " + b5s + " Если ответа нет, ответ A = {NULL}";
	if (a5 == 0){
	an5 = "A = {NULL}";
	}else {
	if (e5 == 0){
	an5 = "A = {NULL}";
	}else {
	if (d5*a5 < 0){
	an5 = "A = {NULL}";
	if (x51s.equals(x52s)){
	an5 = "A = {" + x51s + "}";
	}else {
	an5 = "A = {"+x51s+"; "+x52s+"}";
	}
	}
	}
	}
	                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             //fucking shit
	double a8 = (int)(Math.random()*4001 - 2000);
	a8 /= 100;
	double ch8 = (int)(Math.random()*2);
	double m8;
	if (ch8 == 0){
	m8 = 0;
	}else {
	m8 = (int)(Math.random()*2 + 2);
	}
	double an8d = Math.pow(a8,m8);
	an8d *= 10000;
	an8d = (int)(an8d);
	an8d /= 10000;
	String a8s = Double.toString(a8);
	String m8s = Double.toString(m8);
	an8 = Double.toString(an8d);
	ex8 = a8s + "^" + m8s + " = ? Ответ дать в десятичных дробях, 4 знака после запятой";

	double a9 = (int)(Math.random()*11 - 5);
	double b9 = (int)(Math.random()*4);
	if (b9 == 0){
	b9 = (int)(Math.random()*4);
	}
	double c9 = (int)(Math.random()*4);
	if (c9 == 0){
	c9 = (int)(Math.random()*4);
	}
	double ch91 = (int)(Math.random()*2);
	double m9;
	if (ch91 == 0){
	m9 = 0;
	}else {
	if (ch91 == 2) {
	m9 = (int)(Math.random()*(-11) - 10);
	}else{
	m9 = (int)(Math.random()*9 + 2);
	}
	}
	double ch92 = (int)(Math.random()*3);
	double n9;
	if (ch92 == 0){
	n9 = 0;
	}else {
	if (ch92 == 2) {
	n9 = (int)(Math.random()*(-11) - 10);
	}else{
	n9 = (int)(Math.random()*9 + 2);
	}
	}
	double d9 = a9;
	double e9 = a9;
	double f9;
	f9 = m9 - n9;

	String a9s = Double.toString(a9);
	String m9s = Double.toString(m9);
	String b9s = Double.toString(b9);
	String n9s = Double.toString(n9);
	String c9s = Double.toString(c9);
	String d9s = Double.toString(d9);
	String e9s = Double.toString(e9);
	String f9s = Double.toString(f9);
	an9 = a9s + "^" + f9s;
	ex9 = d9s + "^" + m9s + " / (" + e9s + "^" + n9s + ") = ? Ответ дать в виде a^b";


	int ch100 = (int)(Math.random()*3);
	double a10;
	a10 = 2;
	double b10 = (int)(Math.random()*10 + 1);
	double c10 = (int)(Math.random()*10 + 1);
	double ch101 = (int)(Math.random()*3);
	double m10;
	if (ch101 == 0){
	m10 = 0;
	}else {
	if (ch101 == 2) {
	m10 = (int)(Math.random()*(-11) - 10);
	}else{
        m10 = (int)(Math.random()*9 + 2);
	}
	}
	double ch102 = (int)(Math.random()*3);
	double n10;
	if (ch102 == 0){
	n10 = 0;
	}else {
	if (ch102 == 2) {
	n10 = (int)(Math.random()*(-11) - 10);
	}else{
	n10 = (int)(Math.random()*9 + 2);
	}
	}
	double d10 = Math.pow(a10,b10);
	double e10 = Math.pow(a10,c10);
	double f10;
	f10 = m10*b10 - n10*c10;

	String a10s = Double.toString(a10);
	String m10s = Double.toString(m10);
	String b10s = Double.toString(b10);
	String n10s = Double.toString(n10);
	String c10s = Double.toString(c10);
	String d10s = Double.toString(d10);
	String e10s = Double.toString(e10);
	String f10s = Double.toString(f10);
	an10 = a10s + "^" + f10s;
	ex10 = d10s + "^" + m10s + " / (" + e10s + "^" + n10s + ") = ? Ответ дать в виде a^b";


	double a11;
	a11 = 3;
	double b11 = (int)(Math.random()*5 + 1);
	double c11 = (int)(Math.random()*5 + 1);
	double ch111 = (int)(Math.random()*3);
	double m11;
	if (ch111 == 0){
	m11 = 0;
	}else {
	if (ch111 == 2) {
	m11 = (int)(Math.random()*(-11) - 10);
	}else{
	m11 = (int)(Math.random()*9 + 2);
	}
	}
	double ch112 = (int)(Math.random()*3);
	double n11;
	if (ch112 == 0){
	n11 = 0;
	}else {
	if (ch112 == 2) {
	n11 = (int)(Math.random()*(-11) - 10);
	}else{
	n11 = (int)(Math.random()*9 + 2);
	}
	}
	double d11 = Math.pow(a11,b11);
	double e11 = Math.pow(a11,c11);
	double f11;
	f11 = m11*b11 - n11*c11;
	String a11s = Double.toString(a11);
	String m11s = Double.toString(m11);
	String b11s = Double.toString(b11);
	String n11s = Double.toString(n11);
	String c11s = Double.toString(c11);
	String d11s = Double.toString(d11);
	String e11s = Double.toString(e11);
	String f11s = Double.toString(f11);
	an11 = a11s + "^" + f11s;
	ex11 = d11s + "^" + m11s + " / (" + e11s + "^" + n11s + ") = ? Ответ дать в виде a^b";

	double a12 = 5;
	double b12 = (int)(Math.random()*5 + 1);
	double c12 = (int)(Math.random()*5 + 1);
	double ch121 = (int)(Math.random()*3);
	double m12;
	if (ch121 == 0){
	m12 = 0;
	}else {
	if (ch121 == 2) {
	m12 = (int)(Math.random()*(-11) - 10);
	}else{
	m12 = (int)(Math.random()*9 + 2);
	}
	}
	double ch122 = (int)(Math.random()*3);
	double n12;
	if (ch122 == 0){
	n12 = 0;
	}else {
	if (ch122 == 2) {
	n12 = (int)(Math.random()*(-11) - 10);
	}else{
	n12 = (int)(Math.random()*9 + 2);
	}
	}
	double d12 = Math.pow(a12 , b12);
	double e12 = Math.pow(a12 ,c12);
	double f12;
	f12 = m12*b12 - n12*c12;
	String a12s = Double.toString(a12);
	String m12s = Double.toString(m12);
	String b12s = Double.toString(b12);
	String n12s = Double.toString(n12);
	String c12s = Double.toString(c12);
	String d12s = Double.toString(d12);
	String e12s = Double.toString(e12);
	String f12s = Double.toString(f12);
	an12 = a12s + "^" + f12s;
	ex12 = d12s + "^" + m12s + " / (" + e12s + "^" + n12s + ") = ? Ответ дать в виде a^b";
	
	double var13da = (int)(Math.random()*601 - 300);
	var13da /= 100;
	double var13db = (int)(Math.random()*601 - 300);
	var13db /= 100;
	double var13dc = (int)(Math.random()*601 - 300);
	var13dc /= 100;
	double an13d =var13da*(1+var13db)*(1+var13dc);
	an13d *= 1000;
	an13d = (int)(an1d);
	an13d /= 1000;
	an13 = Double.toString (an1d);
	var13da *= 100;
	var13db *= 100;
	var13dc *= 100;
	String var13sa = Double.toString (var13da);
	var13sa += "%";
	String var13sb = Double.toString (var13db);
	var13sb += "%";
	String var13sc = Double.toString (var13dc);
	var13sc += "%";
	ex13 = var13sa + " + " + var13sb + " + " + var13sc + " = ? Ответ дать в десятичных дробях";
    
	//|aex + (ac)| = ad
		double a14=(int)(Math.random()*15 - 7);
		double c14=(int)(Math.random()*15 - 7);
		double d14=(int)(Math.random()*15 - 7);
		double e14=(int)(Math.random()*15 - 7);
		double x141 = ((-1)*c5 + d5)/e5;
		double x142 = ((-1)*c5 - d5)/e5;
		x141 *= 1000;
		x141 = (int)(x141);
		x141 /= 1000;
		x142 *= 1000;
		x142 = (int)(x142);
		x142 /= 1000;
		String x141s = Double.toString(x141);
		String x142s = Double.toString(x142);
		String a14s = Double.toString(a14*c14);
		String b14s = Double.toString(d14*a14);
		String c14s = Double.toString(a14*e14);
		ex14 = "|" + c14s + "x" + " + " + a14s + "| = " + b14s + " Если ответа нет, ответ A = {NULL}";
		if (a14 == 0){
		an14 = "A = {NULL}";
		}else {
		if (e14 == 0){
		an14 = "A = {NULL}";
		}else {
		if (d14*a14 < 0){
		an14 = "A = {NULL}";
		}else{
		if (x141s.equals(x142s)){
		an14 = "A = {" + x141s + "}";
		}else {
		an14 = "A = {"+x141s+"; "+x142s+"}";
		}
		}
		}
		}
        
        double a15 = (int)(Math.random()*41 - 20);
	double ch15 = (int)(Math.random()*2);
	double m15;
	if (ch15 == 0){
	m15 = 0;
	}else {
	m15 = (int)(Math.random()*2 + 2);
	}
	double an15d = Math.pow(a15,m15);
	String a15s = Double.toString(a15);
	String m15s = Double.toString(m15);
	an15 = Double.toString(an15d);
	ex15 = a15s + "^" + m15s + " = ? Ответ дать в десятичных дробях, 4 знака после запятой";
        

JFrame jfrm = new JFrame ("НАШМАТ");
//Layout - table 17*3
jfrm.setLayout (new GridLayout (17,3));
//Size -full screen
jfrm.setSize (10000, 20000);
jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//What is "НАШМАТ":
JLabel jlab1a = new JLabel ("НАШМАТ - кроссплатформенная программа программа,");
JLabel jlab2a = new JLabel ("каждый день генерирующая новые примеры");
JLabel jlab3a = new JLabel ("по образовательной программе 610 Санкт-Петербургской");
JLabel jlab4a = new JLabel ("классической гимназии по математике. В случае, если у вас возник");
//Technical notes
JLabel jlab6a = new JLabel ("Для ввода ответа нажмите ENTER");
JLabel jlab5a = new JLabel ("вопрос, пишите issue  на http://github.com/bialger/NashMat");
//JLabels for exercises
JLabel jlab1 = new JLabel ("1. " + ex1);
JLabel jlab2 = new JLabel ("2. " + ex2);
JLabel jlab3 = new JLabel ("3. " + ex3);
JLabel jlab4 = new JLabel ("4. " + ex4);
JLabel jlab5 = new JLabel ("5. " + ex5);
JLabel jlab6 = new JLabel ("6. " + ex6);
JLabel jlab7 = new JLabel ("7. " + ex7);
JLabel jlab8 = new JLabel ("8. " + ex8);
JLabel jlab9 = new JLabel ("9. " + ex9);
JLabel jlab10 = new JLabel ("10. " + ex10);
JLabel jlab11 = new JLabel ("11. " + ex11);
JLabel jlab12 = new JLabel ("12. " + ex12);
JLabel jlab13 = new JLabel ("13. " + ex13);
JLabel jlab14 = new JLabel ("14. " + ex14);
JLabel jlab15 = new JLabel ("15. " + ex15);
JLabel jlab16 = new JLabel ("16. " + ex16);
JLabel jlab17 = new JLabel ("17. " + ex17);
JLabel jlab18 = new JLabel ("18. " + ex18);
//Setting action commands for text fields
jtf1.setActionCommand ("tf1");
jtf2.setActionCommand ("tf2");
jtf3.setActionCommand ("tf3");
jtf4.setActionCommand ("tf4");
jtf5.setActionCommand ("tf5");
jtf6.setActionCommand ("tf6");
jtf7.setActionCommand ("tf7");
jtf8.setActionCommand ("tf8");
jtf9.setActionCommand ("tf9");
jtf10.setActionCommand ("tf10");
jtf11.setActionCommand ("tf11");
jtf12.setActionCommand ("tf12");
jtf13.setActionCommand ("tf13");
jtf14.setActionCommand ("tf14");
jtf15.setActionCommand ("tf15");
jtf16.setActionCommand ("tf16");
jtf17.setActionCommand ("tf17");
jtf18.setActionCommand ("tf18");
jtf1.addActionListener(this);
jtf2.addActionListener(this);
jtf3.addActionListener(this);
jtf4.addActionListener(this);
jtf5.addActionListener(this);
jtf6.addActionListener(this);
jtf7.addActionListener(this);
jtf8.addActionListener(this);
jtf9.addActionListener(this);
jtf10.addActionListener(this);
jtf11.addActionListener(this);
jtf12.addActionListener(this);
jtf13.addActionListener(this);
jtf14.addActionListener(this);
jtf15.addActionListener(this);
jtf16.addActionListener(this);
jtf17.addActionListener(this);
jtf18.addActionListener(this);
//Making anything that we need visible
jfrm.add(jlab1a);
jfrm.add(jlab2a);
jfrm.add(jlab3a);
jfrm.add(jlab4a);
jfrm.add(jlab5a);
jfrm.add(jlab6a);
jfrm.add(jlab1);
jfrm.add(jtf1);
jfrm.add(jlabRes1);
jfrm.add(jlab2);
jfrm.add(jtf2);
jfrm.add(jlabRes2);
jfrm.add(jlab3);
jfrm.add(jtf3);
jfrm.add(jlabRes3);
jfrm.add(jlab4);
jfrm.add(jtf4);
jfrm.add(jlabRes4);
jfrm.add(jlab5);
jfrm.add(jtf5);
jfrm.add(jlabRes5);
jfrm.add(jlab6);
jfrm.add(jtf6);
jfrm.add(jlabRes6);
jfrm.add(jlab7);
jfrm.add(jtf7);
jfrm.add(jlabRes7);
jfrm.add(jlab8);
jfrm.add(jtf8);
jfrm.add(jlabRes8);
jfrm.add(jlab9);
jfrm.add(jtf9);
jfrm.add(jlabRes9);
jfrm.add(jlab10);
jfrm.add(jtf10);
jfrm.add(jlabRes10);
jfrm.add(jlab11);
jfrm.add(jtf11);
jfrm.add(jlabRes11);
jfrm.add(jlab12);
jfrm.add(jtf12);
jfrm.add(jlabRes12);
jfrm.add(jlab13);
jfrm.add(jtf13);
jfrm.add(jlabRes13);
jfrm.add(jlab14);
jfrm.add(jtf14);
jfrm.add(jlabRes14);
jfrm.add(jlab15);
jfrm.add(jtf15);
jfrm.add(jlabRes15);
//I commented it because I didn`t do this exercises 
/*
jfrm.add(jlab16);
jfrm.add(jtf16);
jfrm.add(jlabRes16);
jfrm.add(jlab17);
jfrm.add(jtf17);
jfrm.add(jlabRes17);
jfrm.add(jlab18);
jfrm.add(jtf18);
jfrm.add(jlabRes18);
*/
//jfrm.add(jlabEndRes);
jfrm.setVisible(true);


}
//Setting answers
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	boolean bb = true;
    int cr = 0;
    String nt = "Правильно! =)";
	String resStr1 = jtf1.getText();
	String resStr2 = jtf2.getText();
	String resStr3 = jtf3.getText();
	String resStr4 = jtf4.getText();
	String resStr5 = jtf5.getText();
	String resStr6 = jtf6.getText();
	String resStr7 = jtf7.getText();
	String resStr8 = jtf8.getText();
	String resStr9 = jtf9.getText();
	String resStr10 = jtf10.getText();
	String resStr11 = jtf11.getText();
	String resStr12 = jtf12.getText();
	String resStr13 = jtf13.getText();
	String resStr14 = jtf14.getText();
	String resStr15 = jtf15.getText();
	String resStr16 = jtf16.getText();
	String resStr17 = jtf17.getText();
	String resStr18 = jtf8.getText();
	String iresStr1 = jlabRes1.getText();
    String iresStr2 = jlabRes2.getText();
    String iresStr3 = jlabRes3.getText();
    String iresStr4 = jlabRes4.getText();
    String iresStr5 = jlabRes5.getText();
    String iresStr6 = jlabRes6.getText();
    String iresStr7 = jlabRes7.getText();
    String iresStr8 = jlabRes8.getText();
    String iresStr9 = jlabRes9.getText();
    String iresStr10 = jlabRes10.getText();
    String iresStr11 = jlabRes11.getText();
    String iresStr12 = jlabRes12.getText();
    String iresStr13 = jlabRes13.getText();
    String iresStr14 = jlabRes14.getText();
    String iresStr15 = jlabRes15.getText();
    String iresStr16 = jlabRes16.getText();
    String iresStr17 = jlabRes17.getText();
    String iresStr18 = jlabRes18.getText();
	if(e.getActionCommand().equals("tf1")){
	if (resStr1.equals (an1)){
	jlabRes1.setText ("Правильно! =)");
	if(bb1 == 0){
		cr += 1;
		jlabEndRes.setText("Ваш результат: "+ cr + " из 12");
		bb1 = 1;
	}
	}
	else {
	jlabRes1.setText ("Неверно... :(");
	if (bb1 == 1){
		cr -= 1;
		jlabEndRes.setText("Ваш результат: "+ cr + " из 12");
		bb1 = 0;
	}
	}
	}else{
	if(e.getActionCommand().equals("tf2")){
	if (resStr2.equals (an2)){
	jlabRes2.setText ("Правильно! =)");
	if(bb2 == 0){
		cr += 1;
		jlabEndRes.setText("Ваш результат: "+ cr + " из 12");
		bb2 = 1;
	}
	}
	else {
	jlabRes2.setText ("Неверно... :(");
	if (bb2 == 1){
		cr -= 1;
		jlabEndRes.setText("Ваш результат: "+ cr + " из 12");
		bb2 = 0;
	}
	}
	}else{
	if(e.getActionCommand().equals("tf3")){
	if (resStr3.equals (an3)){
	jlabRes3.setText ("Правильно! =)");
	if(bb3 == 0){
		cr += 1;
		jlabEndRes.setText("Ваш результат: "+ cr + " из 12");
		bb3 = 1;
	}
	}
	else {
	jlabRes3.setText ("Неверно... :(");
	if (bb3 == 1){
		cr -= 1;
		jlabEndRes.setText("Ваш результат: "+ cr + " из 12");
		bb3 = 0;
	}
	}
	}else{
	if(e.getActionCommand().equals("tf4")){
	if (resStr4.equals (an4)){
	jlabRes4.setText ("Правильно! =)");
	if(bb4 == 0){
		cr += 1;
		jlabEndRes.setText("Ваш результат: "+ cr + " из 12");
		bb4 = 1;
	}
	}
	else {
	jlabRes4.setText ("Неверно... :(");
	if (bb4 == 1){
		cr -= 1;
		jlabEndRes.setText("Ваш результат: "+ cr + " из 12");
		bb4 = 0;
	}
	}
	}else{
	if(e.getActionCommand().equals("tf5")){
	if (resStr5.equals (an5)){
	jlabRes5.setText ("Правильно! =)");
	if(bb5 == 0){
		cr += 1;
		jlabEndRes.setText("Ваш результат: "+ cr + " из 12");
		bb5 = 1;
	}
	}
	else {
	jlabRes5.setText ("Неверно... :(");
	if (bb5 == 1){
		cr -= 1;
		jlabEndRes.setText("Ваш результат: "+ cr + " из 12");
		bb5 = 0;
	}
	}
	}else{
	if(e.getActionCommand().equals("tf6")){
	if (resStr6.equals (an6)){
	jlabRes6.setText ("Правильно! =)");
	if(bb6 == 0){
		cr += 1;
		jlabEndRes.setText("Ваш результат: "+ cr + " из 12");
		bb6 = 1;
	}
	}
	else {
	jlabRes6.setText ("Неверно... :(");
	if (bb6 == 1){
		cr -= 1;
		jlabEndRes.setText("Ваш результат: "+ cr + " из 12");
		bb6 = 0;
	}
	}
	}else{
	if(e.getActionCommand().equals("tf7")){
	if (resStr7.equals (an7)){
	jlabRes7.setText ("Правильно! =)");
	if(bb7 == 0){
		cr += 1;
		jlabEndRes.setText("Ваш результат: "+ cr + " из 12");
		bb7 = 1;
	}
	}
	else {
	jlabRes7.setText ("Неверно... :(");
	if (bb7 == 1){
		cr -= 1;
		jlabEndRes.setText("Ваш результат: "+ cr + " из 12");
		bb7 = 0;
	}
	}
	}else{
	if(e.getActionCommand().equals("tf8")){
	if (resStr8.equals (an8)){
	jlabRes8.setText ("Правильно! =)");
	if(bb8 == 0){
		cr += 1;
		jlabEndRes.setText("Ваш результат: "+ cr + " из 12");
		bb8 = 1;
	}
	}
	else {
	jlabRes8.setText ("Неверно... :(");
	if (bb8 == 1){
		cr -= 1;
		jlabEndRes.setText("Ваш результат: "+ cr + " из 12");
		bb8 = 0;
	}
	}
	}else{
	if(e.getActionCommand().equals("tf9")){
	if (resStr9.equals (an9)){
	jlabRes9.setText ("Правильно! =)");
	if(bb9 == 0){
		cr += 1;
		jlabEndRes.setText("Ваш результат: "+ cr + " из 12");
		bb9 = 1;
	}
	}
	else {
	jlabRes9.setText ("Неверно... :(");
	if (bb9 == 1){
		cr -= 1;
		jlabEndRes.setText("Ваш результат: "+ cr + " из 12");
		bb9 = 0;
	}
	}
	}else{
	if(e.getActionCommand().equals("tf10")){
	if (resStr10.equals (an10)){
	jlabRes10.setText ("Правильно! =)");
	if(bb10 == 0){
		cr += 1;
		jlabEndRes.setText("Ваш результат: "+ cr + " из 12");
		bb10 = 1;
	}
	}
	else {
	jlabRes10.setText ("Неверно... :(");
	if (bb10 == 1){
		cr -= 1;
		jlabEndRes.setText("Ваш результат: "+ cr + " из 12");
		bb10 = 0;
	}
	}
	}else{
	if(e.getActionCommand().equals("tf11")){
	if (resStr11.equals (an11)){
	jlabRes11.setText ("Правильно! =)");
	if(bb11 == 0){
		cr += 1;
		jlabEndRes.setText("Ваш результат: "+ cr + " из 12");
		bb11 = 1;
	}
	}
	else {
	jlabRes11.setText ("Неверно... :(");
	if (bb11 == 1){
		cr -= 1;
		jlabEndRes.setText("Ваш результат: "+ cr + " из 12");
		bb11 = 0;
	}
	}
	}else{
	if(e.getActionCommand().equals("tf12")){
	if (resStr12.equals (an12)){
	jlabRes12.setText ("Правильно! =)");
	if(bb12 == 0){
		cr += 1;
		jlabEndRes.setText("Ваш результат: "+ cr + " из 12");
		bb12 = 1;
	}
	}
	else {
	jlabRes12.setText ("Неверно... :(");
	if (bb12 == 1){
		cr -= 1;
		jlabEndRes.setText("Ваш результат: "+ cr + " из 12");
		bb12 = 0;
	}
	}
	}else{
	if(e.getActionCommand().equals("tf13")){
	if (resStr13.equals (an13)){
	jlabRes13.setText ("Правильно! =)");
	if(bb13 == 0){
		cr += 1;
		jlabEndRes.setText("Ваш результат: "+ cr + " из 12");
		bb13 = 1;
	}
	}
	else {
	jlabRes13.setText ("Неверно... :(");
	if (bb13 == 1){
		cr -= 1;
		jlabEndRes.setText("Ваш результат: "+ cr + " из 12");
		bb13 = 0;
	}
	}
	}else{
	if(e.getActionCommand().equals("tf14")){
	if (resStr14.equals (an14)){
	jlabRes14.setText ("Правильно! =)");
	if(bb14 == 0){
		cr += 1;
		jlabEndRes.setText("Ваш результат: "+ cr + " из 12");
		bb14 = 1;
	}
	}
	else {
	jlabRes14.setText ("Неверно... :(");
	if (bb14 == 1){
		cr -= 1;
		jlabEndRes.setText("Ваш результат: "+ cr + " из 12");
		bb14 = 0;
	}
	}
	}else{
	if(e.getActionCommand().equals("tf15")){
	if (resStr15.equals (an15)){
	jlabRes15.setText ("Правильно! =)");
	if(bb15 == 0){
		cr += 1;
		jlabEndRes.setText("Ваш результат: "+ cr + " из 12");
		bb15 = 1;
	}
	}
	else {
	jlabRes15.setText ("Неверно... :(");
	if (bb15 == 1){
		cr -= 1;
		jlabEndRes.setText("Ваш результат: "+ cr + " из 12");
		bb15 = 0;
	}
	}
	}else{
	if(e.getActionCommand().equals("tf16")){
	if (resStr16.equals (an16)){
	jlabRes16.setText ("Правильно! =)");
	if(bb16 == 0){
		cr += 1;
		jlabEndRes.setText("Ваш результат: "+ cr + " из 12");
		bb16 = 1;
	}
	}
	else {
	jlabRes16.setText ("Неверно... :(");
	if (bb16 == 1){
		cr -= 1;
		jlabEndRes.setText("Ваш результат: "+ cr + " из 12");
		bb16 = 0;
	}
	}
	}else{
	if(e.getActionCommand().equals("tf17")){
	if (resStr17.equals (an17)){
	jlabRes17.setText ("Правильно! =)");
	if(bb17 == 0){
		cr += 1;
		jlabEndRes.setText("Ваш результат: "+ cr + " из 12");
		bb17 = 1;
	}
	}
	else {
	jlabRes17.setText ("Неверно... :(");
	if (bb17 == 1){
		cr -= 1;
		jlabEndRes.setText("Ваш результат: "+ cr + " из 12");
		bb17 = 0;
	}
	}
	}else{
	if(e.getActionCommand().equals("tf18")){
	if (resStr18.equals (an18)){
	jlabRes18.setText ("Правильно! =)");
	if(bb18 == 0){
		cr += 1;
		jlabEndRes.setText("Ваш результат: "+ cr + " из 12");
		bb18 = 1;
	}
	}
	else {
	jlabRes18.setText ("Неверно... :(");
	if (bb18 == 1){
		cr -= 1;
		jlabEndRes.setText("Ваш результат: "+ cr + " из 12");
		bb18 = 0;
	}
	}
	}
	}
	}
	}
	}
	}
	}
	}
	}
	}
	}
	}
	}
	}
	}
    }
    }
    }
    
    }

//It is NOT simple construction but I could not do it better in 11 PM
//Standard swing construction
public static void main (String[] args){
SwingUtilities.invokeLater( new Runnable (){public void run (){
	new NashMat();
	}});
}


}
