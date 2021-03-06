package question_java;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

public class Quiz {
	private SimpleIntegerProperty num;
	private SimpleStringProperty quiz;
	private SimpleStringProperty select1;
	private SimpleStringProperty select2;
	private SimpleStringProperty select3;

	public Quiz(int num, String quiz, String select1, String select2, String select3) {
		super();
		this.num = new SimpleIntegerProperty(num);
		this.quiz = new SimpleStringProperty(quiz);
		this.select1 = new SimpleStringProperty(select1);
		this.select2 = new SimpleStringProperty(select2);
		this.select3 = new SimpleStringProperty(select3);
	} // num

	public void setNum(int num) {
		this.num.set(num);
	}

	public int getNum() {
		return this.num.get();
	}

	public SimpleIntegerProperty numProperty() {
		return this.num;

	} // quiz

	public void setQuiz(String quiz) {
		this.quiz.set(quiz);
	}

	public String getQuiz() {
		return this.quiz.get();
	}

	public SimpleStringProperty quizProperty() {
		return this.quiz;
	}

	// select1
	public void setSelect1(String select1) {
		this.select1.set(select1);
	}

	public String getSelect1() {
		return this.select1.get();
	}

	public SimpleStringProperty select1Property() {
		return this.select1;
	}

	// select2
	public void setSelect2(String select2) {
		this.select2.set(select2);
	}

	public String getSelect2() {
		return this.select2.get();
	}

	public SimpleStringProperty select2Property() {
		return this.select2;

	} // select3

	public void setSelect3(String select3) {
		this.select3.set(select3);
	}

	public String getSelect3() {
		return this.select3.get();
	}

	public SimpleStringProperty select3Property() {
		return this.select3;
	}
}