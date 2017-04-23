import java.util.List;
import java.util.Map;

public class Bug {

    class Bugzilla {
        String _product;
        String _component;
        String _summary;
        String _version;

        String description;
        String op_sys;
        String platform;
        String priority;
        String severity;
        String assignedTo;
        String groups;
        List<String> keywords;
        String status;
        String resolution;
    }

    class Jira{
        int project;
        String summary;
        int issueType;
        String assignee;
        String reporter;
        int priority;
        List<String> labels;
        Map<String,String> timeTracking;
        int security;
        List<Integer> versions;
        String environment;
        String description;
        String duedate;
        List<Integer> fixVersions;
        List<Integer> components;
        //custom fields
    }

    class PivotalTracker{
        String _name;
        String currentState;
        String estimate;
        //and others
    }

    class Redmine{
        String projectId;
        String trackerId;
        String statusId;
        String priorityId;
        String subject;
        String description;
        String categoryId;
        String fixed_version_id;
        String assignedToId;
        String parentIssueId;
        Object custom_fields;
        String watcherUserIds;
        String isPrivate;
        String estimatedHours;
    }

    class TestTrack{
        long recordid;
        long defectnumber;
        String _summary;
        String state;
        String disposition;
        String _type;
        String priority;
        String product;
        String component;
        String reference;
        String severity;
        String enteredby;
        String workaround;
        List<Object> workaroundInlineAttachList;
        String dateentered;
        String datetimecreated;
        String datetimemodified;
        String createdbyuser;
        String modifiedbyuser;
        long storypoints;
        long percentdone;
    }

    class Trac{
        String reporter;
        String type;
        String component;
        String version;
        List<String> keywords;
        String priority;
        String milestone;
        String assignedTo;
        String cc;
        String resolution;
        String status;
        String summary;
        String description;
    }

    class YouTrack{
        String project;
        String summary;
        String description;
        List<String> attachments; //file in "multipart/form-data" format
        String permittedGroup;
    }

    class TFS{
        String iterationPath;
        String iterationID;
        String externalLinkCount;
        String teamProject;
        int hyperlinkCount;
        int attachedFileCount;
        String nodeName;
        String areaPath;
        String revisedDate;
        String changedDate;
        int id;
        int areaId;
        String authorizedAs;
        String title;
        String state;
        String authorizedDate;
        String watermark;
        String rev;
        String changedBy;
        String reason;
        String assignedTo;
        String workItemType;
        String createdDate;
        String createdBy;
        String description;
        String history;
        List<String> BISLinks;
        int relatedLinkCount;
        List<String> tags;
        String systemInfo;
        String closedDate;
        List<String> reproSteps;
        String backlogPriority;
        String effort;
        String acceptanceCriteria;
        String severity;
        String integrationBuild;
        String foundIn;
    }

    class CQ{
        String type;
        String title;
        String severity;
        String description;
        String status;
        String identifier;
        String creator;
        String contributor;
        String shortTitle;
        String history;
        List<Object> Attachments;
        String project;
        String priority;
        int id;
        String version;
    }
}
