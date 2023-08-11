package menu.io;

public class Menu {

	private int menuNum;
	private String category;
	private String menuName;
	private int price;
	
	public Menu() {}
	
	public Menu(int menuNum, String category, String menuName, int price) {
		super();
		this.menuNum = menuNum;
		this.category = category;
		this.menuName = menuName;
		this.price = price;
	}

	public int getMenuNum() {
		return menuNum;
	}
	public void setMenuNum(int menuNum) {
		this.menuNum = menuNum;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getMenuName() {
		return menuName;
	}
	public void setMenuName(String menuName) {
		this.menuName = menuName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}

	
	
	@Override
	public String toString() {
		return "[메뉴번호 " + menuNum + "], [카테고리 : " + category + "], [메뉴명 : " + menuName + "], [가격 : " + price + "]";
	}
	
	
	
}
