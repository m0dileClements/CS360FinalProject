package source;

public class RestServerConverter extends Converter
{
	public void clearData(Main main) {
		if(main.allUsers.size() != 0) {
			main.allUsers.clear();
		}
		if(main.allTerms.size() != 0) {
			main.allTerms.clear();
		}
		if(main.allDepts.size() != 0) {
			main.allDepts.clear();
		}
		if(main.allCourses.size() != 0) {
			main.allCourses.clear();
		}
		if(main.allClasses.size() != 0) {
			main.allClasses.clear();
		}
		if(main.allInstructors.size() != 0) {
			main.allInstructors.clear();
		}
		if(main.allRooms.size() != 0) {
			main.allRooms.clear();
		}
		main.currentUser = null;
		
	}
	
	
	
	
}
