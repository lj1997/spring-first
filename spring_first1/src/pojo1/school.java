package pojo1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class school {
	@Autowired
	@Qualifier("stu")
   stu1 s;

	@Override
	public String toString() {
		return "school [s=" + s + "]";
	}
	
	
}
