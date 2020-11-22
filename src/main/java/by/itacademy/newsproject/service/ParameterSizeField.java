package by.itacademy.newsproject.service;

/**
 * Parameters Form defines size of News fields to be saved in DB next in DAO level.
 *
 */
public class ParameterSizeField {
	public static final int FORM_SECTION_LENGTH = 45;
	public static final int FORM_AUTHOR_LENGTH = 45;
	public static final int FORM_BRIEF_LENGTH = 100;
	public static final int FORM_CONTENT_LENGTH = 300;
	
	public static final int FORM_ID_MIN = 1;
	public static final int FORM_ID_MAX =  9999999;

	private ParameterSizeField() {
	}
}