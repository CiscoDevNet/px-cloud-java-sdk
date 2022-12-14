CX Partner Portal APIs for the Partners

  For more information, please visit [https://cisco.com](https://cisco.com)


## Requirements

Building the API client library requires:
1. Java 1.8+
2. Maven (3.8.3+)/Gradle (7.2+)

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

Refer to the [OSSRH Guide](http://central.sonatype.org/pages/ossrh-guide.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>com.cisco.services</groupId>
  <artifactId>px-cloud-java-sdk</artifactId>
  <version>1.0.0</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
  repositories {
    mavenCentral()     // Needed if the 'px-cloud-java-sdk' jar has been published to maven central.
    mavenLocal()       // Needed if the 'px-cloud-java-sdk' jar has been published to the local maven repo.
  }

  dependencies {
     implementation "com.cisco.services:px-cloud-java-sdk:1.0.0"
  }
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/px-cloud-java-sdk-1.0.0.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

// Import classes:
import com.cisco.px.client.ApiClient;
import com.cisco.px.client.ApiException;
import com.cisco.px.client.Configuration;
import com.cisco.px.client.auth.*;
import com.cisco.px.client.models.*;
import com.cisco.px.client.api.ContractsDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-cx.cisco.com/px");
    
    // Configure OAuth2 access token for authorization: oAuth2
    OAuth oAuth2 = (OAuth) defaultClient.getAuthentication("oAuth2");
    oAuth2.setAccessToken("YOUR ACCESS TOKEN");

    ContractsDataApi apiInstance = new ContractsDataApi(defaultClient);
    Integer successTrackId = 56; // Integer | successTrackId
    Integer puid = 56; // Integer | puid
    String customerId = "customerId_example"; // String | customerId
    String guName = "guName_example"; // String | guName
    Integer limit = 56; // Integer | 
    Integer offset = 56; // Integer | 
    try {
      DataPaginationResponse result = apiInstance.fetchContractsSummaryUsingGET(successTrackId, puid, customerId, guName, limit, offset);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ContractsDataApi#fetchContractsSummaryUsingGET");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://api-cx.cisco.com/px*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*ContractsDataApi* | [**fetchContractsSummaryUsingGET**](docs/ContractsDataApi.md#fetchContractsSummaryUsingGET) | **GET** /v2/contracts | Get the list of contracts summary
*CustomerDataApi* | [**fetchContractsDetailsUsingGET**](docs/CustomerDataApi.md#fetchContractsDetailsUsingGET) | **GET** /v1/contract/details | Get the list of contracts Details from flat table. It supports pagination , filtering and sorting
*CustomerDataApi* | [**getCustomerReport**](docs/CustomerDataApi.md#getCustomerReport) | **GET** /v1/customers/{customerId}/reports/{reportId} | Get the report
*CustomerDataApi* | [**getCustomersLifeCycle**](docs/CustomerDataApi.md#getCustomersLifeCycle) | **GET** /v1/customers/{customerId}/lifecycle | Get customer lifecycle
*CustomerDataApi* | [**requestCustomerReport**](docs/CustomerDataApi.md#requestCustomerReport) | **POST** /v1/customers/{customerId}/reports | Request customer data reports as bulk files
*PartnerDataApi* | [**getContracts**](docs/PartnerDataApi.md#getContracts) | **GET** /v1/contracts | List of contracts
*PartnerDataApi* | [**getCustomers**](docs/PartnerDataApi.md#getCustomers) | **GET** /v1/customers | List of customers
*PartnerDataApi* | [**getSuccessTracks**](docs/PartnerDataApi.md#getSuccessTracks) | **GET** /v1/successTracks | Success Tracks
*PartnerOffersDataApi* | [**getPartnerOffers**](docs/PartnerOffersDataApi.md#getPartnerOffers) | **GET** /v1/partnerOffers | Get Partner Offers
*PartnerOffersSessionsDataApi* | [**getPartnerOffersSessions**](docs/PartnerOffersSessionsDataApi.md#getPartnerOffersSessions) | **GET** /v1/partnerOffersSessions | Get Info about Partner Offers Sessions
*CrashRiskApi* | [**assetRiskFactorsUsingGet**](docs/CrashRiskApi.md#assetRiskFactorsUsingGet) | **GET** /v1/customers/{customerId}/insights/crashRisk/assets/{assetIdBase64}/riskFactors | Get risk factors of a device
*CrashRiskApi* | [**assetsCrashedUsingGET**](docs/CrashRiskApi.md#assetsCrashedUsingGET) | **GET** /v1/customers/{customerId}/insights/crashRisk/assetsCrashed | Get the list of crashed devices for last given time period
*CrashRiskApi* | [**crashHistoryUsingGET**](docs/CrashRiskApi.md#crashHistoryUsingGET) | **GET** /v1/customers/{customerId}/insights/crashRisk/asset/{assetIdBase64}/crashHistory | Get the device crash-detail - Asset 360(time stamp, reset reason)
*CrashRiskApi* | [**crashRiskAssetsUsingGet**](docs/CrashRiskApi.md#crashRiskAssetsUsingGet) | **GET** /v1/customers/{customerId}/insights/crashRisk/assets | Get devices which are at risk of crash owned by a customer, sorted by risk score in descending order by default
*CrashRiskApi* | [**similarAssetsUsingGet**](docs/CrashRiskApi.md#similarAssetsUsingGet) | **GET** /v1/customers/{customerId}/insights/crashRisk/assets/{assetIdBase64}/similarAssets | Get similar assets based on the similarity score
*FaultsApi* | [**getAffectedAssetsDetailsUsingGET**](docs/FaultsApi.md#getAffectedAssetsDetailsUsingGET) | **GET** /v1/customers/{customerId}/insights/faults/{faultId}/affectedAssets/{assetName}/faultHistory | Assets Fault History
*FaultsApi* | [**getAffectedAssetsUsingGET**](docs/FaultsApi.md#getAffectedAssetsUsingGET) | **GET** /v1/customers/{customerId}/insights/faults/{faultId}/affectedAssets | Affected Assets
*FaultsApi* | [**getFaultsSummaryUsingGET**](docs/FaultsApi.md#getFaultsSummaryUsingGET) | **GET** /v1/customers/{customerId}/insights/faults/{faultId}/summary | Fault summary
*FaultsApi* | [**getFaultsUsingGET**](docs/FaultsApi.md#getFaultsUsingGET) | **GET** /v1/customers/{customerId}/insights/faults | Faults details
*SoftwareSuggestionsAPI* | [**getSoftwareGroupAssetsUsingGET**](docs/InsightsApi.md#getSoftwareGroupAssetsUsingGET) | **GET** /v1/customers/{customerId}/insights/software/softwareGroups/{softwareGroupId}/assets | Asset information in the Software Group
*SoftwareSuggestionsAPI* | [**getSoftwareGroupSuggestionsUsingGET**](docs/InsightsApi.md#getSoftwareGroupSuggestionsUsingGET) | **GET** /v1/customers/{customerId}/insights/software/softwareGroups/{softwareGroupName}/suggestions | Software Group suggestions
*SoftwareSuggestionsAPI* | [**getSoftwareGroupsUsingGET**](docs/InsightsApi.md#getSoftwareGroupsUsingGET) | **GET** /v1/customers/{customerId}/insights/software/softwareGroups | Software Group information


## Documentation for Models

 - [AccSessionAttendees](docs/AccSessionAttendees.md)
 - [AssetError](docs/AssetError.md)
 - [AssetSession](docs/AssetSession.md)
 - [ContractInfo](docs/ContractInfo.md)
 - [ContractResponse](docs/ContractResponse.md)
 - [ContractsErrorResponse](docs/ContractsErrorResponse.md)
 - [Customer](docs/Customer.md)
 - [CustomerInfo](docs/CustomerInfo.md)
 - [CustomerResponse](docs/CustomerResponse.md)
 - [DataPaginationResponse](docs/DataPaginationResponse.md)
 - [ErrorResponse](docs/ErrorResponse.md)
 - [Pagination](docs/Pagination.md)
 - [PartnerAsset](docs/PartnerAsset.md)
 - [PartnerAssetResponse](docs/PartnerAssetResponse.md)
 - [PartnerOffer](docs/PartnerOffer.md)
 - [PartnerOfferAttendee](docs/PartnerOfferAttendee.md)
 - [PartnerOfferSession](docs/PartnerOfferSession.md)
 - [PartnerOfferWithSessions](docs/PartnerOfferWithSessions.md)
 - [PartnerOffersInfo](docs/PartnerOffersInfo.md)
 - [RacetrackBuid](docs/RacetrackBuid.md)
 - [RacetrackBuidPitstop](docs/RacetrackBuidPitstop.md)
 - [RacetrackBuidPitstopAction](docs/RacetrackBuidPitstopAction.md)
 - [RacetrackBuidSolution](docs/RacetrackBuidSolution.md)
 - [RacetrackTooltip](docs/RacetrackTooltip.md)
 - [RacetrackUsecase](docs/RacetrackUsecase.md)
 - [Reason](docs/Reason.md)
 - [Report](docs/Report.md)
 - [ReportStatus](docs/ReportStatus.md)
 - [SolutionMapping](docs/SolutionMapping.md)
 - [SuccessTrackChecklistMapping](docs/SuccessTrackChecklistMapping.md)
 - [SuccessTrackMapping](docs/SuccessTrackMapping.md)
 - [Crash](docs/Crash.md)
 - [CrashRiskDevice](docs/CrashRiskDevice.md)
 - [CrashRiskDevices](docs/CrashRiskDevices.md)
 - [DeviceCrashDetail](docs/DeviceCrashDetail.md)
 - [DeviceDetail](docs/DeviceDetail.md)
 - [DeviceRiskFactors](docs/DeviceRiskFactors.md)
 - [DeviceRiskFactorsResponse](docs/DeviceRiskFactorsResponse.md)
 - [ErrorResponse](docs/ErrorResponse.md)
 - [InventoryCrashDetails](docs/InventoryCrashDetails.md)
 - [SimilarDeviceData](docs/SimilarDeviceData.md)
 - [SimilarDevices](docs/SimilarDevices.md)
 - [AffectedAssets](docs/AffectedAssets.md)
 - [AffectedAssetsResponse](docs/AffectedAssetsResponse.md)
 - [AssetsFaultHistory](docs/AssetsFaultHistory.md)
 - [AssetsFaultHistoryResponse](docs/AssetsFaultHistoryResponse.md)
 - [ErrorResponse](docs/ErrorResponse.md)
 - [Faults](docs/Faults.md)
 - [FaultsResponse](docs/FaultsResponse.md)
 - [FaultsSummary](docs/FaultsSummary.md)
 - [FaultsSummaryResponse](docs/FaultsSummaryResponse.md)
 - [Asset](docs/Asset.md)
 - [AssetResponse](docs/AssetResponse.md)
 - [ErrorResponse](docs/ErrorResponse.md)
 - [ReleaseSummary](docs/ReleaseSummary.md)
 - [SoftwareGroup](docs/SoftwareGroup.md)
 - [SoftwareGroupResponse](docs/SoftwareGroupResponse.md)
 - [SoftwareGroupRisk](docs/SoftwareGroupRisk.md)
 - [SoftwareGroupSuggestions](docs/SoftwareGroupSuggestions.md)
 - [SuggestionSummary](docs/SuggestionSummary.md)
 - [SuggestionSummaryAdvisoriesSeverityInner](docs/SuggestionSummaryAdvisoriesSeverityInner.md)
 - [SuggestionSummaryAdvisoriesSeverityInnerNewOpen](docs/SuggestionSummaryAdvisoriesSeverityInnerNewOpen.md)
 - [SuggestionSummaryAdvisoriesSeverityInnerOpen](docs/SuggestionSummaryAdvisoriesSeverityInnerOpen.md)
 - [SuggestionSummaryAdvisoriesSeverityInnerResolved](docs/SuggestionSummaryAdvisoriesSeverityInnerResolved.md)
 - [SuggestionSummaryBugSeverityInner](docs/SuggestionSummaryBugSeverityInner.md)
 - [SuggestionSummaryBugSeverityInnerNewOpen](docs/SuggestionSummaryBugSeverityInnerNewOpen.md)
 - [SuggestionSummaryBugSeverityInnerOpen](docs/SuggestionSummaryBugSeverityInnerOpen.md)
 - [SuggestionSummaryBugSeverityInnerResolved](docs/SuggestionSummaryBugSeverityInnerResolved.md)
 - [SuggestionSummaryFieldNoticeSeverityInner](docs/SuggestionSummaryFieldNoticeSeverityInner.md)
 - [SuggestionSummaryFieldNoticeSeverityInnerNewOpen](docs/SuggestionSummaryFieldNoticeSeverityInnerNewOpen.md)
 - [SuggestionSummaryFieldNoticeSeverityInnerOpen](docs/SuggestionSummaryFieldNoticeSeverityInnerOpen.md)
 - [SuggestionSummaryFieldNoticeSeverityInnerResolved](docs/SuggestionSummaryFieldNoticeSeverityInnerResolved.md)


## Documentation for Authorization

Authentication schemes defined for the API:
### oAuth2

- **Type**: OAuth
- **Flow**: application
- **Authorization URL**: 
- **Scopes**: N/A


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author

developer-support-pxcloud@cisco.com

