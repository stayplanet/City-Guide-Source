package xyz.niteshsahni.cityguidepro.holder;

import java.util.Vector;

import xyz.niteshsahni.cityguidepro.model.ReviewList;



public class AllCityReview {
	public static Vector<ReviewList> allReviewList = new Vector<ReviewList>();

	public static Vector<ReviewList> getAllCityReview() {
		return AllCityReview.allReviewList;
	}

	public static void setAllCityReview(Vector<ReviewList> allReviewList) {
		AllCityReview.allReviewList = allReviewList;
	}

	public static ReviewList getReviewList(int pos) {
		return AllCityReview.allReviewList.elementAt(pos);
	}

	public static void setReviewList(ReviewList ReviewList) {
		AllCityReview.allReviewList.addElement(ReviewList);
	}

	public static void removeAll() {
		AllCityReview.allReviewList.removeAllElements();
	}

}
