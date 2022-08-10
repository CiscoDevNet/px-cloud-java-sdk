

# SoftwareGroupSuggestions


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**sourceId** | **String** | IP address of the Cisco network management system that manages the assets in the Software Group. |  [optional] |
|**basicSuggestedDate** | **LocalDate** | Date the basic suggestions were updated for the Software Group |  [optional] |
|**softwareGroupName** | **String** | Name of the Software Group whose data is being retrieved |  [optional] |
|**suggestionUpdatedDate** | **LocalDate** | Date the machine learning suggestions were updated for the Software Group |  [optional] |
|**suggestionsInterval** | **Integer** | How often, in months, Cisco software release suggestions will be provided. The customer can configure this value in CX Cloud. |  [optional] |
|**selectedRelease** | **String** | The suggested Cisco software release the customer has selected to use the next time a software update is performed on the assets in the Software Group |  [optional] |
|**suggestionSelectedDate** | **LocalDate** | Date the customer selected a suggested Cisco software release in CX Cloud |  [optional] |
|**softwareGroupRiskTrend** | [**List&lt;SoftwareGroupRisk&gt;**](SoftwareGroupRisk.md) | List of weekly risk scores for the current Cisco software releases calculated over a period of time |  [optional] |
|**suggestionSummaries** | [**List&lt;SuggestionSummary&gt;**](SuggestionSummary.md) | Information about the Cisco software releases running on, and suggested for, the assets in the Software Group |  [optional] |
|**releaseSummary** | [**List&lt;ReleaseSummary&gt;**](ReleaseSummary.md) | List of the following Cisco software releases for the Software Group - • Latest release available from Cisco Software Central • Suggested releases • Cisco DNA Center golden release • Cisco DNA Center Compatibility Matrix minimum release |  [optional] |



