import java.util.List;
import java.util.Map;

/**
 *
 */
interface BugTrackerInterface {

    /**
     * @trackers Bugzilla, Jira(serverInfo)
     * @return version
     */
    String getVersion();

    /**
     * @trackers Bugzilla, YouTrack
     * @param bugId bugID
     * @return all attachments to bug
     */
    List<String> getAttachments(int bugId);

    /**
     * @trackers Bugzilla, Jira, Pivotal Tracker, Redmine, TestTrack, YouTrack, TFS
     * @param attachmentId attachementID
     * @return attachment
     */
    String getAttachement(int attachmentId);

    /**
     * @trackers Bugzilla, Jira, Pivotal Tracker, Redmine, TestTrack, YouTrack, TFS
     * @param bugId bugID
     * @return attachmentID
     */
    int createAttachement(int bugId);

    /**
     * @trackers Bugzilla
     * @param attachmentId attachmentID
     * @param newSomething something to update
     * @return result of update
     */
    String updateAttachment(int attachmentId, Object newSomething);

    /**
     * @trackers Bugzilla, Jira, Pivotal Tracker, Redmine, TestTrack, YouTrack, TFS
     * @param bugId bugID
     * @return Bug info
     */
    Bug getBug(int bugId);

    /**
     * @trackers Bugzilla, Jira(worklog), YouTrack
     * @param bugId bugID
     * @return Bug history
     */
    String getBugHistory(int bugId);

    /**
     * @trackers Bugzilla, Jira(search), Pivotal Tracker, Redmine, TestTrack(search by summary), YouTrack, TFS
     * @param criteria criteria of search
     * @return bug list
     */
    List<Bug> searchBugs(String criteria);

    /**
     * @trackers Bugzilla, Jira, Pivotal Tracker, Redmine, TestTrack, YouTrack, TFS
     * @param bug bug to create
     * @return bugID
     */
    int createBug(Bug bug);

    /**
     * @trackers Bugzilla, Jira, Pivotal Tracker, Redmine, TestTrack, YouTrack, TFS
     * @param bugId bugID
     * @param newSomething something to update
     * @return result of update
     */
    String updateBug(int bugId, Object newSomething);

    /**
     * @trackers Bugzilla
     * @param bugId bugID
     * @return result of update
     */
    String updateLastVisited(int bugId);

    /**
     * @trackers Bugzilla
     * @param bugId bugID
     * @return timestamp of last visit
     */
    String getLastVisited(int bugId);

    /**
     * @trackers Bugzilla, Jira, YouTrack, TFS
     * @param bugId bugID
     * @return array of comments
     */
    List<String> getComments(int bugId);

    /**
     * @trackers Bugzilla, Jira(need also issueID), YouTrack, TFS
     * @param commentId commentID
     * @return comment
     */
    String getComment(int commentId);

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
     * @trackers Bugzilla, Jira(currentUser), Pivotal Tracker(/me)
     * @param login login
     * @param token token
     * @return true if session is available
     */
    boolean validLogin(String login, String token);

    /**
     * @trackers Jira, YouTrack, TFS
     * @param attachmentId attachmentID
     */
    void removeAttachment(int attachmentId);

    /**
     * @trackers Jira, Pivotal Tracker, Redmine, TestTrack, YouTrack, TFS
     * @param bugId bugID
     */
    void deleteBug(int bugId);

    /**
     * @trackers Jira
     * @param bugId bugID
     * @param name assignTO
     */
    void assignBug(int bugId, String name);

    /**
     * @trackers Jira
     * @param bugId bugID
     * @param commentId commentID
     */
    void updateComment(int bugId, int commentId);

    /**
     * @trackers Jira, YouTrack
     * @param bugId bugID
     * @param commentId commentID
     */
    void deleteComment(int bugId, int commentId);

    /**
     * @trackers Jira
     * @param bugId bugID
     * @param query letter
     */
    void notify(int bugId, Object query);

    /**
     * @trackers Jira, Redmine
     * @param bugId bugID
     * @param userId userID
     */
    void addWatcher(int bugId, int userId);

    /**
     * @trackers Jira, Redmine
     * @param bugId bugID
     * @param userId userID
     */
    void removeWatcher(int bugId, int userId);
}
