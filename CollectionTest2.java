import java.util.*;
public class CollectionTest2 {
  public static void main(String[] args) {
    HashMap<String, Integer> nameAge = new HashMap<>();
    nameAge.put("홍길동", 22); 
    int age = nameAge.get("홍길동"); 
    System.out.println("홍길동 나이: " + age); 
    nameAge.put("일지매", 44);
    nameAge.put("박문수", 33);

    age = nameAge.get("박문수");
    System.out.println("박문수의 나이:"+ age);
    HashMap<String, ArrayList<String>> teams = new HashMap<>();
    ArrayList<String> team1 = new ArrayList<>();
    team1.add("이재일");
    team1.add("김지훈");
    team1.add("이주현");
    team1.add("하현진");
    team1.add("임서연");
    team1.add("장준호");
    ArrayList<String> team2 = new ArrayList<>();
    team2.add("김일곤");
    team2.add("김범창");
    team2.add("박수헌");
    team2.add("김건우");
    ArrayList<String> team3 = new ArrayList<>();
    team3.add("강주원");
    team3.add("김규민");
    team3.add("김동준");
    team3.add("박정민");
    team3.add("석진석");

    teams.put("1조", team1);
    teams.put("2조", team2);
    teams.put("3조", team3);

    printTeamMembers("3조", teams);
  }

  public static void printTeamMembers(String teamName, HashMap<String, ArrayList<String>> teams) {
    ArrayList<String> members = teams.get(teamName); 
    System.out.println(teamName + "멤버");
    for (String member : members) {
      System.out.println(member);
    }
    System.err.println();
  }
}
