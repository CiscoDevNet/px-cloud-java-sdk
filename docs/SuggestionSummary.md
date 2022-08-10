

# SuggestionSummary


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**expectedSoftwareGroupRisk** | **Double** | Current risk score of the Cisco software release, which is the level of exposure the software release has to bugs, security advisories, and field notices. The risk score is used to make software suggestions intended to minimize risk for assets in the Software Group. |  [optional] |
|**expectedSoftwareGroupRiskCategory** | **String** | Risk level of the Cisco software release based on its risk score. The risk level can be High, Medium, or Low. |  [optional] |
|**suggestionId** | **BigDecimal** | Unique identifier of the suggestion |  [optional] |
|**name** | **String** | Value that indicates whether the Cisco software release is a current release or one of the suggested release options |  [optional] |
|**releaseDate** | **OffsetDateTime** | Date the Cisco software image was released |  [optional] |
|**release** | **String** | Release of the Cisco software |  [optional] |
|**releaseNotesUrl** | **String** | Public URL for the release notes of the Cisco software release |  [optional] |
|**bugSeverity** | [**List&lt;SuggestionSummaryBugSeverityInner&gt;**](SuggestionSummaryBugSeverityInner.md) | Number of bugs the Cisco software release is exposed to, and for suggested releases, the number of bugs the suggested release addresses |  [optional] |
|**advisoriesSeverity** | [**List&lt;SuggestionSummaryAdvisoriesSeverityInner&gt;**](SuggestionSummaryAdvisoriesSeverityInner.md) | Number of security advisories the current Cisco software releases are exposed to that are addressed by the suggested release |  [optional] |
|**fieldNoticeSeverity** | [**List&lt;SuggestionSummaryFieldNoticeSeverityInner&gt;**](SuggestionSummaryFieldNoticeSeverityInner.md) | Number of field notices the current Cisco software releases are exposed to that are addressed by the suggested release |  [optional] |



