package com.company;
import java.util.Date;

public class Main {

            static void division() {
                System.out.println("Обработка встроенных типов исключений. Деление на ноль:");
                try{
                    System.out.println(10/0);

                }catch (ArithmeticException  e){
                    System.err.println("Деление на ноль невозможно!"+e);
                    // e.printStackTrace();
                }
            }

            static void array() {
                System.out.println("\nОбработка встроенных типов исключений. Элемент вне массива:");
                int array[]={1,6,8,3};
                try{
                    array[4]=5;
                }catch (ArrayIndexOutOfBoundsException e){
                    System.err.println("Элемент вне границ данного массива!"+e);
                    // e.printStackTrace();
                }
            }

            static void cases(int exceptionType) {
                System.out.println("\nМетод с аргументом " + exceptionType);
                try {
                    switch (exceptionType) {
                        case 0:
                            throw new NullPointerException();
                        case 1:
                            throw new ArithmeticException();
                        case 2:
                            throw new ArrayIndexOutOfBoundsException();
                    }
                }
                catch (NullPointerException e) {
                    System.err.println("Исключение: " + e);
                }
                catch (ArithmeticException e){
                    System.err.println("Исключение: " + e);
                }
                catch (ArrayIndexOutOfBoundsException e){
                    System.err.println("Исключение: " + e);
                }
            }

            static void MyException() {
                System.out.println("\nГенерирование исклчения собственного подкласса:");
                try{
                    throw new MyExp();
                }catch (MyExp e){
                    System.err.println("Собственное исключение."+e);
                }
            }

            public static void main(String[] args) {
                division();
                array();
                MyException();
                cases(0);
                cases(1);
                cases(2);
            }
        }

