

# Asset


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**deploymentStatus** | **String** | Value that indicates whether a suggested Cisco software release has been selected by the customer in CX Cloud to use for the next software update on the asset - • None- A suggested release has not been selected • Upgrade- A suggested release has been selected • Production- A suggested release is already running on the asset |  [optional] |
|**assetName** | **String** | Unique asset name |  [optional] |
|**ipAddress** | **String** | IP address assigned to the asset |  [optional] |
|**selectedRelease** | **String** | The suggested Cisco software release the customer selected to use for the next software update on the asset |  [optional] |
|**releaseDate** | **LocalDate** | Date the Cisco software image was released |  [optional] |
|**softwareGroupName** | **String** | Name of the Software Group whose data is being retrieved. The Software Group name is based on the Cisco product ID of the assets in the Software Group. |  [optional] |
|**softwareType** | **String** | Cisco software type running on the asset, for example IOS-XE |  [optional] |
|**currentRelease** | **String** | Cisco software release running on the asset |  [optional] |



