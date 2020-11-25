package by.itacademy.newsproject.controller;

public class ParameterSession {
	public static final String KEY_CURRENT_PAGE = "current_page";
	public static final String KEY_RESULT_OPERATION = "result_operation";
	public static final String KEY_EMPTY_NEWS_TABLE = "emptyNewsTable";

	public static final String PAGE_DEFAULT = "main";
	public static final String PAGE_SHOW_FORM_FOR_ADD_AND_UPDATE = "showFormForAddAndUpdate";
	public static final String PAGE_WELCOME = "welcomePage";

	public static final String ACTION_UPDATE_NEWS = "updateNews";
	public static final String ACTION_FIND_ALL_NEWS = "findAllNews";
	public static final String ACTION_FIND_NEWS = "findNews";

	public static final String LOCALE = "locale";





	public static final String RESULT_OPERATION_MSG_CREATE_SUCCESS = "News added successfully";
	public static final String RESULT_OPERATION_MSG_CREATE_UPDATE_FAILED = "Create or Update failed";
	public static final String RESULT_OPERATION_MSG_DELETE_SUCCESS = "News deleted successfully";
	public static final String RESULT_OPERATION_MSG_UPDATE_SUCCESS = "News updated successfully";

	private ParameterSession() {
	}
}