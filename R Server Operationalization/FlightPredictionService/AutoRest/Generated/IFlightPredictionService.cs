// Code generated by Microsoft (R) AutoRest Code Generator 0.17.0.0
// Changes may cause incorrect behavior and will be lost if the code is
// regenerated.

namespace FlightService
{
    using Models;

    /// <summary>
    /// </summary>
    public partial interface IFlightPredictionService : System.IDisposable
    {
        /// <summary>
        /// The base URI of the service.
        /// </summary>
        System.Uri BaseUri { get; set; }

        /// <summary>
        /// Gets or sets json serialization settings.
        /// </summary>
        Newtonsoft.Json.JsonSerializerSettings SerializationSettings { get; }

        /// <summary>
        /// Gets or sets json deserialization settings.
        /// </summary>
        Newtonsoft.Json.JsonSerializerSettings DeserializationSettings { get; }


            /// <summary>
        /// Logs the user in
        /// </summary>
        /// <param name='loginRequest'>
        /// </param>
        /// <param name='customHeaders'>
        /// The headers that will be added to request.
        /// </param>
        /// <param name='cancellationToken'>
        /// The cancellation token.
        /// </param>
        System.Threading.Tasks.Task<Microsoft.Rest.HttpOperationResponse<AccessTokenResponse>> LoginWithHttpMessagesAsync(LoginRequest loginRequest, System.Collections.Generic.Dictionary<string, System.Collections.Generic.List<string>> customHeaders = null, System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken));

        /// <summary>
        /// The user renews access token and refresh token
        /// </summary>
        /// <param name='renewTokenRequest'>
        /// </param>
        /// <param name='customHeaders'>
        /// The headers that will be added to request.
        /// </param>
        /// <param name='cancellationToken'>
        /// The cancellation token.
        /// </param>
        System.Threading.Tasks.Task<Microsoft.Rest.HttpOperationResponse<AccessTokenResponse>> RenewTokenWithHttpMessagesAsync(RenewTokenRequest renewTokenRequest, System.Collections.Generic.Dictionary<string, System.Collections.Generic.List<string>> customHeaders = null, System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken));

        /// <summary>
        /// The user revokes a refresh token
        /// </summary>
        /// <param name='refreshToken'>
        /// The refresh token to be revoked
        /// </param>
        /// <param name='customHeaders'>
        /// The headers that will be added to request.
        /// </param>
        /// <param name='cancellationToken'>
        /// The cancellation token.
        /// </param>
        System.Threading.Tasks.Task<Microsoft.Rest.HttpOperationResponse<AccessTokenResponse>> RevokeRefreshTokenWithHttpMessagesAsync(string refreshToken, System.Collections.Generic.Dictionary<string, System.Collections.Generic.List<string>> customHeaders = null, System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken));

        /// <summary>
        /// Consume the FlightPredictionService web service.
        /// </summary>
        /// <param name='webServiceParameters'>
        /// Input parameters to the web service.
        /// </param>
        /// <param name='customHeaders'>
        /// The headers that will be added to request.
        /// </param>
        /// <param name='cancellationToken'>
        /// The cancellation token.
        /// </param>
        System.Threading.Tasks.Task<Microsoft.Rest.HttpOperationResponse<WebServiceResult>> FlightPredictionWithHttpMessagesAsync(InputParameters webServiceParameters, System.Collections.Generic.Dictionary<string, System.Collections.Generic.List<string>> customHeaders = null, System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken));

        /// <summary>
        /// Consume the FlightPredictionService web service asynchronously.
        /// </summary>
        /// <param name='batchWebServiceParameters'>
        /// Input parameters to the web service.
        /// </param>
        /// <param name='parallelCount'>
        /// Number of threads used to process entries in the batch. Default
        /// value is 10. Please make sure not to use too high of a number
        /// because it might negatively impact performance.
        /// </param>
        /// <param name='customHeaders'>
        /// The headers that will be added to request.
        /// </param>
        /// <param name='cancellationToken'>
        /// The cancellation token.
        /// </param>
        System.Threading.Tasks.Task<Microsoft.Rest.HttpOperationResponse<StartBatchExecutionResponse>> StartBatchExecutionWithHttpMessagesAsync(System.Collections.Generic.IList<InputParameters> batchWebServiceParameters, int? parallelCount = default(int?), System.Collections.Generic.Dictionary<string, System.Collections.Generic.List<string>> customHeaders = null, System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken));

        /// <summary>
        /// Gets all batch executions for FlightPredictionService.
        /// </summary>
        /// <param name='customHeaders'>
        /// The headers that will be added to request.
        /// </param>
        /// <param name='cancellationToken'>
        /// The cancellation token.
        /// </param>
        System.Threading.Tasks.Task<Microsoft.Rest.HttpOperationResponse<System.Collections.Generic.IList<string>>> GetBatchExecutionsWithHttpMessagesAsync(System.Collections.Generic.Dictionary<string, System.Collections.Generic.List<string>> customHeaders = null, System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken));

        /// <summary>
        /// Gets all batch executions for FlightPredictionService.
        /// </summary>
        /// <param name='executionId'>
        /// Execution id of the execution
        /// </param>
        /// <param name='showPartialResults'>
        /// Returns the already processed results of the batch execution even
        /// if it hasn't been fully completed.
        /// </param>
        /// <param name='customHeaders'>
        /// The headers that will be added to request.
        /// </param>
        /// <param name='cancellationToken'>
        /// The cancellation token.
        /// </param>
        System.Threading.Tasks.Task<Microsoft.Rest.HttpOperationResponse<BatchWebServiceResult>> GetBatchExecutionStatusWithHttpMessagesAsync(string executionId, bool? showPartialResults = default(bool?), System.Collections.Generic.Dictionary<string, System.Collections.Generic.List<string>> customHeaders = null, System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken));

        /// <summary>
        /// Cancels and deletes all batch executions for
        /// FlightPredictionService.
        /// </summary>
        /// <param name='executionId'>
        /// Execution id of the execution.
        /// </param>
        /// <param name='customHeaders'>
        /// The headers that will be added to request.
        /// </param>
        /// <param name='cancellationToken'>
        /// The cancellation token.
        /// </param>
        System.Threading.Tasks.Task<Microsoft.Rest.HttpOperationResponse<System.Collections.Generic.IList<string>>> CancelAndDeleteBatchExecutionWithHttpMessagesAsync(string executionId, System.Collections.Generic.Dictionary<string, System.Collections.Generic.List<string>> customHeaders = null, System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken));

        /// <summary>
        /// Gets all files from an individual execution in
        /// FlightPredictionService.
        /// </summary>
        /// <param name='executionId'>
        /// Execution id of the execution
        /// </param>
        /// <param name='index'>
        /// Index of the execution in the batch.
        /// </param>
        /// <param name='customHeaders'>
        /// The headers that will be added to request.
        /// </param>
        /// <param name='cancellationToken'>
        /// The cancellation token.
        /// </param>
        System.Threading.Tasks.Task<Microsoft.Rest.HttpOperationResponse<System.Collections.Generic.IList<string>>> GetBatchExecutionFilesWithHttpMessagesAsync(string executionId, int index, System.Collections.Generic.Dictionary<string, System.Collections.Generic.List<string>> customHeaders = null, System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken));

        /// <summary>
        /// Gets a specific file from an execution in FlightPredictionService.
        /// </summary>
        /// <param name='executionId'>
        /// Execution id of the execution
        /// </param>
        /// <param name='index'>
        /// Index of the execution in the batch.
        /// </param>
        /// <param name='fileName'>
        /// Name of the file to be returned.
        /// </param>
        /// <param name='customHeaders'>
        /// The headers that will be added to request.
        /// </param>
        /// <param name='cancellationToken'>
        /// The cancellation token.
        /// </param>
        System.Threading.Tasks.Task<Microsoft.Rest.HttpOperationResponse<System.IO.Stream>> GetBatchExecutionFileWithHttpMessagesAsync(string executionId, int index, string fileName, System.Collections.Generic.Dictionary<string, System.Collections.Generic.List<string>> customHeaders = null, System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken));

    }
}
