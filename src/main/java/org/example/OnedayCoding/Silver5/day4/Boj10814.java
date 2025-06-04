package org.example.OnedayCoding.Silver5.day4;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Boj10814 {


    // The main method must be in a class named "Main".
    class Main {
        public static void main(String[] args) throws Exception {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st = new StringTokenizer(br.readLine());
            int people = Integer.parseInt(st.nextToken());
            Member[] mb = new Member[people];
            for(int i = 0 ; i < people ; i++){
                st = new StringTokenizer(br.readLine());
                int age = Integer.parseInt(st.nextToken());
                String name = st.nextToken();
                int number = i;
                Member member = new Member(age, name, number);
                mb[i] = member;
            }
            Arrays.sort(mb, (o1, o2)->{
                if(o1.age == o2.age){
                    return o1.number - o2.number;
                }
                else{
                    return o1.age - o2.age;
                }
            });
            for(Member m : mb){
                System.out.println(m.age +" "+ m.name);
            }
        }
        private static class Member{
            int age;
            String name;
            int number;
            public Member(int age, String name, int number){
                this.age = age;
                this.name = name;
                this.number= number;
            }
        }
    }
}
