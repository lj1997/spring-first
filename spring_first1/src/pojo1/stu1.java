package pojo1;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("stu")
public class stu1 {
   @Value("1")
   int id;

@Override
public String toString() {
	return "stu1 [id=" + id + "]";
}
}
