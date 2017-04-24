import java.util.List;

interface MostPopular  {

    /**
     * @trackers Bugzilla, Jira, Pivotal Tracker, Redmine, TestTrack, YouTrack, TFS
     * @param bugId bugID
     * @return attachmentID
     */
    int createAttachement(int bugId);

    /**
     * @trackers Bugzilla, Jira, Pivotal Tracker, Redmine, TestTrack, YouTrack, TFS
     * @param attachmentId attachementID
     * @return attachment
     */
    String getAttachement(int attachmentId);

    /**
     * @trackers Bugzilla, Jira, Pivotal Tracker, Redmine, TestTrack, YouTrack, TFS
     * @param bug bug to create
     * @return bugID
     */
    int createBug(Bug bug);

    /**
     * @trackers Bugzilla, Jira, Pivotal Tracker, Redmine, TestTrack, YouTrack, TFS
     * @param bugId bugID
     * @return Bug info
     */
    Bug getBug(int bugId);

    /**
     * @trackers Bugzilla, Jira, Pivotal Tracker, Redmine, TestTrack, YouTrack, TFS
     * @param bugId bugID
     * @param newSomething something to update
     * @return result of update
     */
    String updateBug(int bugId, Object newSomething);

    /**
     * @trackers Jira, Pivotal Tracker, Redmine, TestTrack, YouTrack, TFS
     * @param bugId bugID
     */
    void deleteBug(int bugId);

    /**
     * @trackers Bugzilla, Jira(search), Pivotal Tracker, Redmine, TestTrack(search by summary), YouTrack, TFS
     * @param criteria criteria of search
     * @return bug list
     */
    List<Bug> searchBugs(String criteria);

    /**
     * @trackers Bugzilla, Jira, Pivotal Tracker, YouTrack, TFS
     * @param bugId bugID
     * @return commentID
     */
    int createComment(int bugId);

    /**
     * @trackers Bugzilla, Jira, Pivotal Tracker, Redmine, TestTrack, TFS
     * @param login login
     * @param password pass
     * @return token, id
     */
    List<String> login(String login, String password);

    /**
     * @trackers Bugzilla, Jira, Pivotal Tracker, TestTrack, YouTrack
     * @param token token
     */
    void logout(String token);

    /**
     * @trackers Bugzilla, Jira(need also issueID), YouTrack, TFS
     * @param commentId commentID
     * @return comment
     */
    String getComment(int commentId);

    /**
     * @trackers Jira, YouTrack, TFS
     * @param attachmentId attachmentID
     */
    void removeAttachment(int attachmentId);

    /**
     * @trackers Bugzilla, Jira(serverInfo)
     * @return version
     */
    String getVersion();
}
