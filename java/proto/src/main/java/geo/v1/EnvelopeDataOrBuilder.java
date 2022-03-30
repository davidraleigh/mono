// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/geo/v1/geometry.proto

package geo.v1;

public interface EnvelopeDataOrBuilder extends
    // @@protoc_insertion_point(interface_extends:geo.v1.EnvelopeData)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * min x value
   * </pre>
   *
   * <code>double xmin = 1 [json_name = "xmin"];</code>
   * @return The xmin.
   */
  double getXmin();

  /**
   * <pre>
   * min y value
   * </pre>
   *
   * <code>double ymin = 2 [json_name = "ymin"];</code>
   * @return The ymin.
   */
  double getYmin();

  /**
   * <pre>
   * max x value
   * </pre>
   *
   * <code>double xmax = 3 [json_name = "xmax"];</code>
   * @return The xmax.
   */
  double getXmax();

  /**
   * <pre>
   * max y value
   * </pre>
   *
   * <code>double ymax = 4 [json_name = "ymax"];</code>
   * @return The ymax.
   */
  double getYmax();

  /**
   * <pre>
   * spatial reference of envelope
   * </pre>
   *
   * <code>.geo.v1.ProjectionData proj = 5 [json_name = "proj"];</code>
   * @return Whether the proj field is set.
   */
  boolean hasProj();
  /**
   * <pre>
   * spatial reference of envelope
   * </pre>
   *
   * <code>.geo.v1.ProjectionData proj = 5 [json_name = "proj"];</code>
   * @return The proj.
   */
  geo.v1.ProjectionData getProj();
  /**
   * <pre>
   * spatial reference of envelope
   * </pre>
   *
   * <code>.geo.v1.ProjectionData proj = 5 [json_name = "proj"];</code>
   */
  geo.v1.ProjectionDataOrBuilder getProjOrBuilder();

  /**
   * <code>double zmin = 6 [json_name = "zmin"];</code>
   * @return The zmin.
   */
  double getZmin();

  /**
   * <code>double zmax = 7 [json_name = "zmax"];</code>
   * @return The zmax.
   */
  double getZmax();
}
