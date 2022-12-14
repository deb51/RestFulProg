package in.ashokit;

import org.springframework.stereotype.Component;

@Component
public class AuthorDetails {
	private String authorName;
	private int aBookNum;

	public AuthorDetails() {

		System.out.println("Author Details Const Created");
	}

	
	public AuthorDetails(String authorName, int aBookNum) {
		super();
		this.authorName = authorName;
		this.aBookNum = aBookNum;
	}


	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public int getaBookNum() {
		return aBookNum;
	}

	public void setaBookNum(int aBookNum) {
		this.aBookNum = aBookNum;
	}

	@Override
	public String toString() {
		return "AuthorDetails [authorName=" + authorName + ", aBookNum=" + aBookNum + "]";
	}
}
