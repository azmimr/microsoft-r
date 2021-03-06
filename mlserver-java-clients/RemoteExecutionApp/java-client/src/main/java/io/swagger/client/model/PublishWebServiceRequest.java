/*
 * DeployRClient
 * Integration technology for deploying R and Python analytics inside web, desktop, mobile, and dashboard applications as well as backend systems. Turn your R or Python scripts into analytics web services, so code can be easily executed by applications running on a secure server.  The core APIs can be grouped into several categories, including: [Authentication](#authentication-apis), [Web Services](#services-management-apis), [Sessions](#session-apis), [Snapshots](#snapshot-apis), [Status](#status-apis), and [Centralized Configuration](#centralized-configuration-apis). 
 *
 * OpenAPI spec version: 9.2.1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.ParameterDefinition;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * PublishWebServiceRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-09-28T05:42:17.706Z")
public class PublishWebServiceRequest {
  @SerializedName("snapshotId")
  private String snapshotId = null;

  @SerializedName("code")
  private String code = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("operationId")
  private String operationId = null;

  @SerializedName("inputParameterDefinitions")
  private List<ParameterDefinition> inputParameterDefinitions = null;

  @SerializedName("outputParameterDefinitions")
  private List<ParameterDefinition> outputParameterDefinitions = null;

  /**
   * Type of the runtime. **Optional [Default R]**
   */
  @JsonAdapter(RuntimeTypeEnum.Adapter.class)
  public enum RuntimeTypeEnum {
    R("R"),
    
    PYTHON("Python");

    private String value;

    RuntimeTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static RuntimeTypeEnum fromValue(String text) {
      for (RuntimeTypeEnum b : RuntimeTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<RuntimeTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final RuntimeTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public RuntimeTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return RuntimeTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("runtimeType")
  private RuntimeTypeEnum runtimeType = null;

  @SerializedName("initCode")
  private String initCode = null;

  @SerializedName("outputFileNames")
  private List<String> outputFileNames = null;

  public PublishWebServiceRequest snapshotId(String snapshotId) {
    this.snapshotId = snapshotId;
    return this;
  }

   /**
   * ID of the snapshot to be used for service. **Optional**
   * @return snapshotId
  **/
  @ApiModelProperty(value = "ID of the snapshot to be used for service. **Optional**")
  public String getSnapshotId() {
    return snapshotId;
  }

  public void setSnapshotId(String snapshotId) {
    this.snapshotId = snapshotId;
  }

  public PublishWebServiceRequest code(String code) {
    this.code = code;
    return this;
  }

   /**
   * Code to execute. Specific to the runtime type. **&lt;font color &#x3D; &#39;red&#39;&gt;Required&lt;/font&gt;**
   * @return code
  **/
  @ApiModelProperty(value = "Code to execute. Specific to the runtime type. **<font color = 'red'>Required</font>**")
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public PublishWebServiceRequest description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Description for the web service. **Optional**
   * @return description
  **/
  @ApiModelProperty(value = "Description for the web service. **Optional**")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public PublishWebServiceRequest operationId(String operationId) {
    this.operationId = operationId;
    return this;
  }

   /**
   * Swagger operationId/alias for web service. **Optional**
   * @return operationId
  **/
  @ApiModelProperty(value = "Swagger operationId/alias for web service. **Optional**")
  public String getOperationId() {
    return operationId;
  }

  public void setOperationId(String operationId) {
    this.operationId = operationId;
  }

  public PublishWebServiceRequest inputParameterDefinitions(List<ParameterDefinition> inputParameterDefinitions) {
    this.inputParameterDefinitions = inputParameterDefinitions;
    return this;
  }

  public PublishWebServiceRequest addInputParameterDefinitionsItem(ParameterDefinition inputParameterDefinitionsItem) {
    if (this.inputParameterDefinitions == null) {
      this.inputParameterDefinitions = new ArrayList<ParameterDefinition>();
    }
    this.inputParameterDefinitions.add(inputParameterDefinitionsItem);
    return this;
  }

   /**
   * Input parameters definitions for the execution. **Optional**
   * @return inputParameterDefinitions
  **/
  @ApiModelProperty(value = "Input parameters definitions for the execution. **Optional**")
  public List<ParameterDefinition> getInputParameterDefinitions() {
    return inputParameterDefinitions;
  }

  public void setInputParameterDefinitions(List<ParameterDefinition> inputParameterDefinitions) {
    this.inputParameterDefinitions = inputParameterDefinitions;
  }

  public PublishWebServiceRequest outputParameterDefinitions(List<ParameterDefinition> outputParameterDefinitions) {
    this.outputParameterDefinitions = outputParameterDefinitions;
    return this;
  }

  public PublishWebServiceRequest addOutputParameterDefinitionsItem(ParameterDefinition outputParameterDefinitionsItem) {
    if (this.outputParameterDefinitions == null) {
      this.outputParameterDefinitions = new ArrayList<ParameterDefinition>();
    }
    this.outputParameterDefinitions.add(outputParameterDefinitionsItem);
    return this;
  }

   /**
   * Output parameter definitions for the execution. **Optional**
   * @return outputParameterDefinitions
  **/
  @ApiModelProperty(value = "Output parameter definitions for the execution. **Optional**")
  public List<ParameterDefinition> getOutputParameterDefinitions() {
    return outputParameterDefinitions;
  }

  public void setOutputParameterDefinitions(List<ParameterDefinition> outputParameterDefinitions) {
    this.outputParameterDefinitions = outputParameterDefinitions;
  }

  public PublishWebServiceRequest runtimeType(RuntimeTypeEnum runtimeType) {
    this.runtimeType = runtimeType;
    return this;
  }

   /**
   * Type of the runtime. **Optional [Default R]**
   * @return runtimeType
  **/
  @ApiModelProperty(value = "Type of the runtime. **Optional [Default R]**")
  public RuntimeTypeEnum getRuntimeType() {
    return runtimeType;
  }

  public void setRuntimeType(RuntimeTypeEnum runtimeType) {
    this.runtimeType = runtimeType;
  }

  public PublishWebServiceRequest initCode(String initCode) {
    this.initCode = initCode;
    return this;
  }

   /**
   * Code that runs before each request. Specific to the runtime type. **Optional**
   * @return initCode
  **/
  @ApiModelProperty(value = "Code that runs before each request. Specific to the runtime type. **Optional**")
  public String getInitCode() {
    return initCode;
  }

  public void setInitCode(String initCode) {
    this.initCode = initCode;
  }

  public PublishWebServiceRequest outputFileNames(List<String> outputFileNames) {
    this.outputFileNames = outputFileNames;
    return this;
  }

  public PublishWebServiceRequest addOutputFileNamesItem(String outputFileNamesItem) {
    if (this.outputFileNames == null) {
      this.outputFileNames = new ArrayList<String>();
    }
    this.outputFileNames.add(outputFileNamesItem);
    return this;
  }

   /**
   * Files that are returned by the response. **Optional**
   * @return outputFileNames
  **/
  @ApiModelProperty(value = "Files that are returned by the response. **Optional**")
  public List<String> getOutputFileNames() {
    return outputFileNames;
  }

  public void setOutputFileNames(List<String> outputFileNames) {
    this.outputFileNames = outputFileNames;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PublishWebServiceRequest publishWebServiceRequest = (PublishWebServiceRequest) o;
    return Objects.equals(this.snapshotId, publishWebServiceRequest.snapshotId) &&
        Objects.equals(this.code, publishWebServiceRequest.code) &&
        Objects.equals(this.description, publishWebServiceRequest.description) &&
        Objects.equals(this.operationId, publishWebServiceRequest.operationId) &&
        Objects.equals(this.inputParameterDefinitions, publishWebServiceRequest.inputParameterDefinitions) &&
        Objects.equals(this.outputParameterDefinitions, publishWebServiceRequest.outputParameterDefinitions) &&
        Objects.equals(this.runtimeType, publishWebServiceRequest.runtimeType) &&
        Objects.equals(this.initCode, publishWebServiceRequest.initCode) &&
        Objects.equals(this.outputFileNames, publishWebServiceRequest.outputFileNames);
  }

  @Override
  public int hashCode() {
    return Objects.hash(snapshotId, code, description, operationId, inputParameterDefinitions, outputParameterDefinitions, runtimeType, initCode, outputFileNames);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PublishWebServiceRequest {\n");
    
    sb.append("    snapshotId: ").append(toIndentedString(snapshotId)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    operationId: ").append(toIndentedString(operationId)).append("\n");
    sb.append("    inputParameterDefinitions: ").append(toIndentedString(inputParameterDefinitions)).append("\n");
    sb.append("    outputParameterDefinitions: ").append(toIndentedString(outputParameterDefinitions)).append("\n");
    sb.append("    runtimeType: ").append(toIndentedString(runtimeType)).append("\n");
    sb.append("    initCode: ").append(toIndentedString(initCode)).append("\n");
    sb.append("    outputFileNames: ").append(toIndentedString(outputFileNames)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
  
}

