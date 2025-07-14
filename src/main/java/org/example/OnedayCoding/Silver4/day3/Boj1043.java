package org.example.OnedayCoding.Silver4.day3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Boj1043 {


    // The main method must be in a class named "Main".
    class Main {
        private static int[] parent;
        public static void main(String[] args) throws Exception{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st = new StringTokenizer(br.readLine());
            int people = Integer.parseInt(st.nextToken());
            int partyCount = Integer.parseInt(st.nextToken());
            parent = new int[people + 1];
            for(int i = 0 ; i < parent.length ; i++){
                parent[i] = i;
            }
            st = new StringTokenizer(br.readLine());
            int truePeople = Integer.parseInt(st.nextToken());
            if(truePeople == 0){
                System.out.println(partyCount);
                return;
            }
            else{  // ❌ 변경: else 제거됨
                int[] truePeopleArr = new int[truePeople];
                for(int i = 0 ; i < truePeopleArr.length ; i++){
                    int num = Integer.parseInt(st.nextToken());
                    truePeopleArr[i] = num;
                }
                Arrays.sort(truePeopleArr);  // ❌ 변경: 이 줄 삭제됨
                for(int i = 1 ; i < truePeopleArr.length ; i++){
                    union(truePeopleArr[0], truePeopleArr[i]);
                }
                ArrayList<int[]> inputList = new ArrayList<>();


                for(int i = 0 ; i < partyCount ; i++){
                    st = new StringTokenizer(br.readLine());
                    int number = Integer.parseInt(st.nextToken());
                    int[] partyPeopleArr = new int[number];
                    for(int j = 0 ; j < number ; j++){
                        partyPeopleArr[j] = Integer.parseInt(st.nextToken());
                    }
                    inputList.add(partyPeopleArr);
                    // ❌ 변경: 아래 if-else 구조가 단순한 for 루프로 변경됨
                    if(number == 1){
                        find(partyPeopleArr[0]);
                    }
                    else if(number == 2){
                        union(partyPeopleArr[0], partyPeopleArr[1]);
                    }
                    else{
                        int standard = partyPeopleArr[0];
                        for(int j = 1 ; j < partyPeopleArr.length ; j++){
                            union(standard, partyPeopleArr[j]);
                        }
                    }
                }
                int truePeopleNum = find(truePeopleArr[0]);//진실을 아는 조합번호  // ❌ 변경: 이 줄이 파티 연결 후로 이동됨

                int answer = 0;
                // ❌ 변경: 아래 답 계산 로직이 boolean 방식으로 변경됨
                for(int i =0; i < inputList.size() ; i++){
                    int[] arr = inputList.get(i);
                    int count = 0;
                    for(int j = 0 ; j < arr.length ; j++){
                        if(truePeopleNum != find(arr[j])){
                            count++;
                        }
                    }
                    if(count == arr.length){
                        answer++;
                    }
                }
                System.out.println(answer);

            }  // ❌ 변경: 이 } 괄호도 제거됨
        }
        private static void union(int a, int b){
            a = find(a);
            b = find(b);
            if(a != b){
                parent[b] = a;  // ❌ 변경: parent[a] = b로 변경됨
            }

        }
        private static int find(int a){
            if(parent[a] == a){
                return a;
            }
            return parent[a] = find(parent[a]);
        }
    }

}
