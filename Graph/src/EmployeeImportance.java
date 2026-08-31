import java.util.*;

class Employee {
    public int id;
    public int importance;
    public List<Integer> subordinates;
}
public class EmployeeImportance {

    public int getImportance(List<Employee> employees, int id) {
        Map<Integer, Employee> empMap = new HashMap<>();
        for (Employee emp: employees) {
            int empId = emp.id;
            empMap.put(empId, emp);
        }

        Queue<Integer> que = new LinkedList<>();
        que.offer(id);
        int ans = 0;
        while (!que.isEmpty()) {
            int empId = que.poll();
            Employee emp = empMap.get(empId);
            ans += emp.importance;

            for (int subordinateId: emp.subordinates){
                que.offer(subordinateId);
            }
        }
        return ans;
    }
}
