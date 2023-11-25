package org.example;

import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class Draw {
    Random random = new Random();
    Scanner scanner = new Scanner(System.in);
    Door door = new Door();

    private static int count_win;
    private static int count_loose;
    private static int count_game;  // количество игр
    private static int test;

    HashMap<Integer,Integer> resultMap = new HashMap<>();
    HashMap<Integer,Integer> resultWin = new HashMap<>();
    HashMap<Integer,Integer> resultLoose = new HashMap<>();


    /**
     * расчитывание рандомно выбранной двери за которой будет автомобиль
     */
    public void Draw() {
        int random_number = 1 + (int) (Math.random() * 3);
        System.out.println("Value: " + random_number);
    }

    /**
     * выбор двери с последующим подтверждением
     */
    public void Choice() {
        String name = "";
        String name_2 = "";
        Random_door(name);

    }

    /**
     * выбор рандомно двери, которая будет выбираться игроком
     * @param random_number - рандомная дверь
     * @param final_answer - конечный выбор двери
     */
    public void Random_door(String random_number) {
        random_number = String.valueOf(1 + (int) (Math.random() * 3));
        System.out.println("Value: " + random_number);
        String offer_door = "";
        String change_door = "";
        String final_door = "";
        String final_answer = "Y";
        Offer(random_number, offer_door,final_door);
//        Door_change(random_number,change_door,final_door);
//        Answer_yes(random_number,change_door,final_door,final_answer);
//        Statistics(final_door);
        System.out.println("");
    }

    /**
     * Выбор ведущим из двух оставшихся дверей
     * @param random_name_door - дверь, котрая выбрана игроком
     * @param random_number - дверь, которую предлагает ведущий взамен выбранной игроком двери
     */
    public void Offer(String random_name_door, String random_number,String final_door) {
        if (random_name_door.equals("1")) {
            random_number = "2";
            System.out.println("У меня есть для вас следующее предложение. Я открываю дверь " + random_number);
        } else if (random_name_door.equals("2")) {
            random_number = "3";
            System.out.println("У меня есть для вас следующее предложение. Я открываю дверь " + random_number);
        } else if (random_name_door.equals("3")) {
            random_number = "2";
            System.out.println("У меня есть для вас следующее предложение. Я открываю дверь " + random_number);
        }


//            if (random_number.equals("2")) {
//                final_door = "3";
//                System.out.println("Вы поменяли дверь на:  " + final_door);
//            } else if (random_number.equals("3")) {
//                final_door = "1";
//                System.out.println("Вы поменяли дверь на:  " + final_door);
//            } else if (random_number.equals("1")) {
//                final_door = "2";
//                System.out.println("Вы поменяли дверь на:  " + final_door);
//            }

//        String final_answer = "";
        Answer_yes(random_name_door,random_number,final_door);
//        Statistics(final_door);
    }

        /**
         * смена двери из двух оставшихся
         * random_name_door - дверь выбранная игроком
         * random_number - дверь, которую предлагает ведущий взамен выбранной игроком двери
         * random_answer - ответ игрока на предложение сменить дверь
         * final_answer - ответ игрока на предложение поменять дверь
         */
        public void Door_change (String random_name_door, String random_number, String final_answer){
            String random_answer = "";
            int number = random.nextInt(2);
            // Если число равно 0, тогда выводим "Y", иначе выводим "N"
            if (number == 0) {
                random_answer = "Y";
                System.out.println("Ваш ответ - Да");
            } else {
                random_answer = "N";
                System.out.println("Ваш ответ - Нет");
            }
            if (random_answer.equals("Y")) {
                random_number = String.valueOf(1 + (int) (Math.random() * 3));
                while (random_name_door.equals(random_number)) {
                    random_number = String.valueOf(1 + (int) (Math.random() * 3));
                }
                final_answer = random_number;
                System.out.println("Вы поменяли дверь на:  " + final_answer);
            } else {
                final_answer = random_name_door;
                System.out.println("Вы оставили свою дверь № " + final_answer);
            }
            Statistics(final_answer);
        }

    /**
     * согласие о смене двери от ведущего
     */
    public void Answer_yes (String random_name_door, String random_number, String final_door) {
//        Offer(random_name_door,random_number);
//        if (answer.equals("Y")) {
            if (random_number.equals("2")) {
                final_door = "3";
                System.out.println("Вы поменяли дверь на:  " + final_door);
            } else if (random_number.equals("3")) {
                final_door = "1";
                System.out.println("Вы поменяли дверь на:  " + final_door);
            } else if (random_number.equals("1")) {
                final_door = "2";
                System.out.println("Вы поменяли дверь на:  " + final_door);
            }
            Statistics(final_door);
    }

    /**
     * статистика побед и поражений
     * @param answer - строка с ответом игрока
     * @param count_win - счетчик побед
     * @param count_loose - счетчик поражений
     */
    public void Statistics(String answer){
        count_game ++;
        if (answer.equals("1")){
            count_win ++;
//            resultMap.put(count_game,count_win);
        } else {
            count_loose ++;
//            resultMap.put(count_game,count_loose);
        }

//        System.out.println(resultMap);
//        printToMap();

        System.out.println("Количество игр: " + count_game);
        System.out.println("Побед - " + count_win + " Поражений " + count_loose);
    }

    public void printToMap(){
//        System.out.println(resultMap);
        for(Integer key : resultMap.keySet()){
            int value = resultMap.get(key);
            System.out.println("Игра : " + key + " Результат : " + value);
        }
//
    }
    }
