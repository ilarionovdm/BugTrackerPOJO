import java.util.List;
import java.util.Map;

interface Garbage {

    /**
     * @tracker Bugzilla
     * @methods getExtensions, getTimezone, getTime, getLastAuditTime, getParameters, getClassifications,
     * searchCommentTags, updateCommentTags, createComponent, updateComponent, deleteComponent,
     * getInformationAboutFields, getFlagTypes, createFlagType, updateFlagType, createGroup, updateGroup, getGroup,
     * getProducts, getProduct, createProduct, updateProduct, createUser, updateUser, getUser, WHOAMI?
     */
    void bugzilla();

    /**
     * @tracker Jira
     * @methods getPermissions, getAllPermissions, userProperties(set,get), applicationProperties(get,set),
     * applicationRoles(get, getAll), getAuditRecords, getAvatars, commentProperties(set,get, getAll, delete),
     * Component(create, update, get, delete), getComponentRelatedIssues, getConfiguration, Configuration TimeTracking,
     * getCustomFieldOption, working with Dashboard, createCustomField, getFields, FieldOptions, Filter, Groups,
     * findGroup, createBugSSS, Issue Remote Links, Transitions, Votes, WorkLog, IssueProperties, Subtask,
     * Issue Link, Issue LinkType, Security Schemes, Issue Type, Issue Type Properties, AutoComplete Data,
     * licenseValidator, MyPreferences, MySelf, Notification Scheme, Password, Permissions Scheme, Priorities, Project,
     * ProjectProperties, ProjectRoles, Project(...), Reindex, Resolution, Roles, Screens, Security Level, Settings,
     * Status, StatusCategory, UniversalAvatar, Upgrade, working with Users, UserProperties, Versions, Workflow,
     * WorkflowScheme, WorkLog
     */
    void jira();

    /**
     * @tracker Pivotal Tracker
     * @methods Project
     */
    void pivotalTracker();

    /**
     * @tracker Redmine
     * @methods Project, Project Memberships, Users, Time Entries, News, Issue Relationships, Project Versions, Wiki,
     * Queries, Statuses, Trackers, Enumerations, Issue categories, Roles, Groups, Custom Fields,
     */
    void redmine();

    /**
     * @tracker TestTrack
     * @methods Customers, Users, Requirements, TestCases, TestRun, Doc, Project, Folders, Tasks, Links, TestConfig
     */
    void testTrack();

    /**
     * @tracker Trac
     * @methods потребует Python-пройслойки. Документация API сейчас в разработке (22/04/2017)
     */
    void trac();

    /**
     * @tracker YouTrack
     * @methods Links, Commands, Project, Users, Administration, Import, Export
     */
    void youtrack();

    /**
     * @tracker TFS
     * @methods a lot of stuff
     */
    void tfs();

}
