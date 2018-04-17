package org.trello4j;


/**
 * The Class TrelloURL.
 */
public class TrelloURL {
	private static final String BASE_URL = "https://api.trello.com/1";

	public static final String ACTION_URL = BASE_URL + "/actions/{0}";
	public static final String ACTION_BOARD_URL = BASE_URL + "/actions/{0}/board";
	public static final String ACTION_CARD_URL = BASE_URL + "/actions/{0}/card";
	public static final String ACTION_LIST_URL = BASE_URL + "/actions/{0}/list";
	public static final String ACTION_MEMBER_URL = BASE_URL + "/actions/{0}/member";
	public static final String ACTION_MEMBERCREATOR_URL = BASE_URL + "/actions/{0}/memberCreator";
	public static final String ACTION_ORGANIZATION_URL = BASE_URL + "/actions/{0}/organization";
	
	public static final String BOARD_URL = BASE_URL + "/boards/{0}";
	public static final String BOARD_ACTIONS_URL = BASE_URL + "/boards/{0}/actions";
	public static final String BOARD_CARDS_URL = BASE_URL + "/boards/{0}/cards";
	public static final String BOARD_CHECKLISTS_URL = BASE_URL + "/boards/{0}/checklists";
	public static final String BOARD_CLOSED_URL = BASE_URL + "/boards/{0}/closed";
	public static final String BOARD_LABELS_URL = BASE_URL + "/boards/{0}/labels";
	public static final String BOARD_LISTS_URL = BASE_URL + "/boards/{0}/lists";
	public static final String BOARD_MEMBERS_URL = BASE_URL + "/boards/{0}/members";
	public static final String BOARD_MEMBERS_INVITED_URL = BASE_URL + "/boards/{0}/membersInvited";
	public static final String BOARD_PREFS_URL = BASE_URL + "/boards/{0}/myPrefs";
	public static final String BOARD_ORGANIZAION_URL = BASE_URL + "/boards/{0}/organization";

	public static final String CARD_URL = BASE_URL + "/cards/{0}";
	public static final String CARD_ACTION_URL = BASE_URL + "/cards/{0}/actions";
	public static final String CARD_ACTION_COMMENT_URL = BASE_URL + "/cards/{0}/actions/comments";
	public static final String CARD_ATTACHEMENT_URL = BASE_URL + "/cards/{0}/attachments";
	public static final String CARD_BOARD_URL = BASE_URL + "/cards/{0}/board";
	public static final String CARD_CHECK_ITEM_STATES_URL = BASE_URL + "/cards/{0}/checkItemStates";
	public static final String CARD_CHECKLISTS_URL = BASE_URL + "/cards/{0}/checklists";
	public static final String CARD_IDLABELS_URL = BASE_URL + "/cards/{0}/idLabels/{1}";
	public static final String CARD_LIST_URL = BASE_URL + "/cards/{0}/list";
	public static final String CARD_MEMBERS_URL = BASE_URL + "/cards/{0}/members";
	
	public static final String CHECKLIST_URL = BASE_URL + "/checklists/{0}";
	public static final String CHECKLIST_BOARD_URL = BASE_URL + "/checklists/{0}/board";
	public static final String CHECKLIST_CARDS_URL = BASE_URL + "/checklists/{0}/cards";
	public static final String CHECKLIST_CHECKITEMS_URL = BASE_URL + "/checklists/{0}/checkItems";
	
	public static final String LABEL_URL = BASE_URL + "/labels/{0}";
	
	public static final String LIST_URL = BASE_URL + "/lists/{0}";
	public static final String LIST_ACTIONS_URL = BASE_URL + "/lists/{0}/action";
	public static final String LIST_BOARD_URL = BASE_URL + "/lists/{0}/board";
	public static final String LIST_CARDS_URL = BASE_URL + "/lists/{0}/cards";
	
	public static final String MEMBER_URL = BASE_URL + "/members/{0}";
	public static final String MEMBER_ACTIONS_URL = BASE_URL + "/members/{0}/actions";
	public static final String MEMBER_BOARD_INVITED_URL = BASE_URL + "/members/{0}/boardInvited";
	public static final String MEMBER_BOARDS_URL = BASE_URL + "/members/{0}/boards";
	public static final String MEMBER_CARDS_URL = BASE_URL + "/members/{0}/cards";
	public static final String MEMBER_NOTIFIACTIONS_URL = BASE_URL + "/members/{0}/notifications";
	public static final String MEMBER_ORGANIZATION_URL = BASE_URL + "/members/{0}/organizations";
	public static final String MEMBER_ORGANIZATION_INVITED_URL = BASE_URL + "/members/{0}/organizationsInvited";
	
	public static final String NOTIFICATION_URL = BASE_URL + "/notifications/{0}";
	public static final String NOTIFICATION_ACTIONS_URL = BASE_URL + "/notifications/{0}/actions";
	public static final String NOTIFICATION_BOARDS_URL = BASE_URL + "/notifications/{0}/boards";
	public static final String NOTIFICATION_CARDS_URL = BASE_URL + "/notifications/{0}/cards";
	public static final String NOTIFICATION_LIST_URL = BASE_URL + "/notifications/{0}/list";
	public static final String NOTIFICATION_MEMBERS_URL = BASE_URL + "/notifications/{0}/members";
	public static final String NOTIFICATION_MEMBER_CREATOR_URL = BASE_URL + "/notifications/{0}/membersCreator";
	public static final String NOTIFICATION_ORGANIZATION_URL = BASE_URL + "/notifications/{0}/organization";
	
	public static final String ORGANIZATION_URL = BASE_URL + "/organizations/{0}";
	public static final String ORGANIZATION_ACTIONS_URL = BASE_URL + "/organizations/{0}/actions";
	public static final String ORGANIZATION_BOARDS_URL = BASE_URL + "/organizations/{0}/boards";
	public static final String ORGANIZATION_MEMBERS_URL = BASE_URL + "/organizations/{0}/members";
	
	public static final String TYPE_URL = BASE_URL + "/types/{0}";
	
	public static final String TOKENS_URL = BASE_URL + "/tokens/{0}";
	public static final String TOKENS_MEMBER_URL = BASE_URL + "/tokens/{0}/member";
	public static final String TOKEN_WEBHOOKS_URL = BASE_URL + "/tokens/{0}/webhooks";
	
	public static final String WEBHOOKS_URL = BASE_URL + "/webhooks/";
	public static final String WEBHOOKS_ID_URL = BASE_URL + "/webhooks/{0}";
	
	private static final String PATH_PARAM_ARG_PREFIX = "\\{";
	private static final String PATH_PARAM_ARG_SUFFIX = "\\}";
	private static final String KEY_QUERY_PARAM = "?key=";
	private static final String TOKEN_QUERY_PARAM = "&token=";
	private static final String FILTER_QUERY_PARAM = "&filter=";

	private final String[] pathParams;

	private final String url;

	private final String apiKey;

	private String token = null;

	private String[] filters = null;


    public static TrelloURL create(String apiKey, String url,
			String... pathParams) {
		return new TrelloURL(apiKey, url, pathParams);
	}

	private TrelloURL(String apiKey, String url, String... pathParams) {
		this.apiKey = apiKey;
		this.url = url;
		this.pathParams = pathParams;
	}

	public TrelloURL token(String token) {
		this.token = token;
		return this;
	}

	public TrelloURL filter(String... filters) {
		this.filters = isArrayEmpty(filters) ? null : filters;
		return this;
	}

	public String build() {
		if (apiKey == null || url == null) {
			throw new NullPointerException(
					"Cannot build trello URL: API key and URL must be set");
		}

		return new StringBuilder()
				.append(createUrlWithPathParams())
				.append(createAuthQueryString())
				.append(createFilterQuery())
				.toString();
	}

	private String createFilterQuery() {
		String filterStr = "";
		if (this.filters != null) {
			StringBuilder sb = new StringBuilder(FILTER_QUERY_PARAM);
			for (int i = 0; i < filters.length; i++) {
				sb.append(i > 0 ? "," : "").append(filters[i]);
			}
			filterStr = sb.toString();
		}
		return filterStr;
	}

	private String createAuthQueryString() {
		StringBuilder sb = new StringBuilder(KEY_QUERY_PARAM).append(apiKey);

		if (this.token != null) {
			sb.append(TOKEN_QUERY_PARAM).append(this.token);
		}
		return sb.toString();
	}

	private String createUrlWithPathParams() {
		if (pathParams == null || pathParams.length == 0) return url;
		String compiledUrl = url;
		for (int i = 0; i < pathParams.length; i++) {
			compiledUrl = compiledUrl.replaceAll(PATH_PARAM_ARG_PREFIX + i
					+ PATH_PARAM_ARG_SUFFIX, pathParams[i]);
		}
		// boardUrl += authQueryString;
		return compiledUrl;
	}

	private static boolean isArrayEmpty(String[] arr) {
		return arr == null || arr.length == 0;
	}

}
