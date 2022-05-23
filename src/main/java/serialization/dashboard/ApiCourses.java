package serialization.dashboard;
//"api":[
//{
//"title": "Rest API",
//"price": 5000
//},
//{
//"title": "Soap UI",
//"price": 6000
//}
//]
public class ApiCourses {
	private String title;
	private int price;
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}

}
