// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: route_guide/v1/stuff.proto

#ifndef GOOGLE_PROTOBUF_INCLUDED_route_5fguide_2fv1_2fstuff_2eproto_2epb_2eh
#define GOOGLE_PROTOBUF_INCLUDED_route_5fguide_2fv1_2fstuff_2eproto_2epb_2eh

#include <limits>
#include <string>
#include <type_traits>

#include "google/protobuf/port_def.inc"
#if PROTOBUF_VERSION < 4022000
#error "This file was generated by a newer version of protoc which is"
#error "incompatible with your Protocol Buffer headers. Please update"
#error "your headers."
#endif  // PROTOBUF_VERSION

#if 4022002 < PROTOBUF_MIN_PROTOC_VERSION
#error "This file was generated by an older version of protoc which is"
#error "incompatible with your Protocol Buffer headers. Please"
#error "regenerate this file with a newer version of protoc."
#endif  // PROTOBUF_MIN_PROTOC_VERSION
#include "google/protobuf/port_undef.inc"
#include "google/protobuf/io/coded_stream.h"
#include "google/protobuf/arena.h"
#include "google/protobuf/arenastring.h"
#include "google/protobuf/generated_message_util.h"
#include "google/protobuf/metadata_lite.h"
#include "google/protobuf/generated_message_reflection.h"
#include "google/protobuf/message.h"
#include "google/protobuf/repeated_field.h"  // IWYU pragma: export
#include "google/protobuf/extension_set.h"  // IWYU pragma: export
#include "google/protobuf/unknown_field_set.h"
#include "route_guide/v1/route_guide.pb.h"
// @@protoc_insertion_point(includes)

// Must be included last.
#include "google/protobuf/port_def.inc"

#define PROTOBUF_INTERNAL_EXPORT_route_5fguide_2fv1_2fstuff_2eproto

PROTOBUF_NAMESPACE_OPEN
namespace internal {
class AnyMetadata;
}  // namespace internal
PROTOBUF_NAMESPACE_CLOSE

// Internal implementation detail -- do not use these members.
struct TableStruct_route_5fguide_2fv1_2fstuff_2eproto {
  static const ::uint32_t offsets[];
};
extern const ::PROTOBUF_NAMESPACE_ID::internal::DescriptorTable
    descriptor_table_route_5fguide_2fv1_2fstuff_2eproto;
namespace route_guide {
namespace v1 {
class RoutePointTest;
struct RoutePointTestDefaultTypeInternal;
extern RoutePointTestDefaultTypeInternal _RoutePointTest_default_instance_;
}  // namespace v1
}  // namespace route_guide
PROTOBUF_NAMESPACE_OPEN
template <>
::route_guide::v1::RoutePointTest* Arena::CreateMaybeMessage<::route_guide::v1::RoutePointTest>(Arena*);
PROTOBUF_NAMESPACE_CLOSE

namespace route_guide {
namespace v1 {

// ===================================================================


// -------------------------------------------------------------------

class RoutePointTest final :
    public ::PROTOBUF_NAMESPACE_ID::Message /* @@protoc_insertion_point(class_definition:route_guide.v1.RoutePointTest) */ {
 public:
  inline RoutePointTest() : RoutePointTest(nullptr) {}
  ~RoutePointTest() override;
  explicit PROTOBUF_CONSTEXPR RoutePointTest(::PROTOBUF_NAMESPACE_ID::internal::ConstantInitialized);

  RoutePointTest(const RoutePointTest& from);
  RoutePointTest(RoutePointTest&& from) noexcept
    : RoutePointTest() {
    *this = ::std::move(from);
  }

  inline RoutePointTest& operator=(const RoutePointTest& from) {
    CopyFrom(from);
    return *this;
  }
  inline RoutePointTest& operator=(RoutePointTest&& from) noexcept {
    if (this == &from) return *this;
    if (GetOwningArena() == from.GetOwningArena()
  #ifdef PROTOBUF_FORCE_COPY_IN_MOVE
        && GetOwningArena() != nullptr
  #endif  // !PROTOBUF_FORCE_COPY_IN_MOVE
    ) {
      InternalSwap(&from);
    } else {
      CopyFrom(from);
    }
    return *this;
  }

  static const ::PROTOBUF_NAMESPACE_ID::Descriptor* descriptor() {
    return GetDescriptor();
  }
  static const ::PROTOBUF_NAMESPACE_ID::Descriptor* GetDescriptor() {
    return default_instance().GetMetadata().descriptor;
  }
  static const ::PROTOBUF_NAMESPACE_ID::Reflection* GetReflection() {
    return default_instance().GetMetadata().reflection;
  }
  static const RoutePointTest& default_instance() {
    return *internal_default_instance();
  }
  static inline const RoutePointTest* internal_default_instance() {
    return reinterpret_cast<const RoutePointTest*>(
               &_RoutePointTest_default_instance_);
  }
  static constexpr int kIndexInFileMessages =
    0;

  friend void swap(RoutePointTest& a, RoutePointTest& b) {
    a.Swap(&b);
  }
  inline void Swap(RoutePointTest* other) {
    if (other == this) return;
  #ifdef PROTOBUF_FORCE_COPY_IN_SWAP
    if (GetOwningArena() != nullptr &&
        GetOwningArena() == other->GetOwningArena()) {
   #else  // PROTOBUF_FORCE_COPY_IN_SWAP
    if (GetOwningArena() == other->GetOwningArena()) {
  #endif  // !PROTOBUF_FORCE_COPY_IN_SWAP
      InternalSwap(other);
    } else {
      ::PROTOBUF_NAMESPACE_ID::internal::GenericSwap(this, other);
    }
  }
  void UnsafeArenaSwap(RoutePointTest* other) {
    if (other == this) return;
    ABSL_DCHECK(GetOwningArena() == other->GetOwningArena());
    InternalSwap(other);
  }

  // implements Message ----------------------------------------------

  RoutePointTest* New(::PROTOBUF_NAMESPACE_ID::Arena* arena = nullptr) const final {
    return CreateMaybeMessage<RoutePointTest>(arena);
  }
  using ::PROTOBUF_NAMESPACE_ID::Message::CopyFrom;
  void CopyFrom(const RoutePointTest& from);
  using ::PROTOBUF_NAMESPACE_ID::Message::MergeFrom;
  void MergeFrom( const RoutePointTest& from) {
    RoutePointTest::MergeImpl(*this, from);
  }
  private:
  static void MergeImpl(::PROTOBUF_NAMESPACE_ID::Message& to_msg, const ::PROTOBUF_NAMESPACE_ID::Message& from_msg);
  public:
  PROTOBUF_ATTRIBUTE_REINITIALIZES void Clear() final;
  bool IsInitialized() const final;

  ::size_t ByteSizeLong() const final;
  const char* _InternalParse(const char* ptr, ::PROTOBUF_NAMESPACE_ID::internal::ParseContext* ctx) final;
  ::uint8_t* _InternalSerialize(
      ::uint8_t* target, ::PROTOBUF_NAMESPACE_ID::io::EpsCopyOutputStream* stream) const final;
  int GetCachedSize() const final { return _impl_._cached_size_.Get(); }

  private:
  void SharedCtor(::PROTOBUF_NAMESPACE_ID::Arena* arena);
  void SharedDtor();
  void SetCachedSize(int size) const final;
  void InternalSwap(RoutePointTest* other);

  private:
  friend class ::PROTOBUF_NAMESPACE_ID::internal::AnyMetadata;
  static ::absl::string_view FullMessageName() {
    return "route_guide.v1.RoutePointTest";
  }
  protected:
  explicit RoutePointTest(::PROTOBUF_NAMESPACE_ID::Arena* arena);
  public:

  static const ClassData _class_data_;
  const ::PROTOBUF_NAMESPACE_ID::Message::ClassData*GetClassData() const final;

  ::PROTOBUF_NAMESPACE_ID::Metadata GetMetadata() const final;

  // nested types ----------------------------------------------------

  // accessors -------------------------------------------------------

  enum : int {
    kPointFieldNumber = 1,
  };
  // .route_guide.v1.Point point = 1 [json_name = "point"];
  bool has_point() const;
  private:
  bool _internal_has_point() const;

  public:
  void clear_point() ;
  const ::route_guide::v1::Point& point() const;
  PROTOBUF_NODISCARD ::route_guide::v1::Point* release_point();
  ::route_guide::v1::Point* mutable_point();
  void set_allocated_point(::route_guide::v1::Point* point);
  private:
  const ::route_guide::v1::Point& _internal_point() const;
  ::route_guide::v1::Point* _internal_mutable_point();
  public:
  void unsafe_arena_set_allocated_point(
      ::route_guide::v1::Point* point);
  ::route_guide::v1::Point* unsafe_arena_release_point();
  // @@protoc_insertion_point(class_scope:route_guide.v1.RoutePointTest)
 private:
  class _Internal;

  template <typename T> friend class ::PROTOBUF_NAMESPACE_ID::Arena::InternalHelper;
  typedef void InternalArenaConstructable_;
  typedef void DestructorSkippable_;
  struct Impl_ {
    ::route_guide::v1::Point* point_;
    mutable ::PROTOBUF_NAMESPACE_ID::internal::CachedSize _cached_size_;
  };
  union { Impl_ _impl_; };
  friend struct ::TableStruct_route_5fguide_2fv1_2fstuff_2eproto;
};

// ===================================================================




// ===================================================================


#ifdef __GNUC__
#pragma GCC diagnostic push
#pragma GCC diagnostic ignored "-Wstrict-aliasing"
#endif  // __GNUC__
// -------------------------------------------------------------------

// RoutePointTest

// .route_guide.v1.Point point = 1 [json_name = "point"];
inline bool RoutePointTest::_internal_has_point() const {
  return this != internal_default_instance() && _impl_.point_ != nullptr;
}
inline bool RoutePointTest::has_point() const {
  return _internal_has_point();
}
inline const ::route_guide::v1::Point& RoutePointTest::_internal_point() const {
  const ::route_guide::v1::Point* p = _impl_.point_;
  return p != nullptr ? *p : reinterpret_cast<const ::route_guide::v1::Point&>(
      ::route_guide::v1::_Point_default_instance_);
}
inline const ::route_guide::v1::Point& RoutePointTest::point() const {
  // @@protoc_insertion_point(field_get:route_guide.v1.RoutePointTest.point)
  return _internal_point();
}
inline void RoutePointTest::unsafe_arena_set_allocated_point(
    ::route_guide::v1::Point* point) {
  if (GetArenaForAllocation() == nullptr) {
    delete reinterpret_cast<::PROTOBUF_NAMESPACE_ID::MessageLite*>(_impl_.point_);
  }
  _impl_.point_ = point;
  // @@protoc_insertion_point(field_unsafe_arena_set_allocated:route_guide.v1.RoutePointTest.point)
}
inline ::route_guide::v1::Point* RoutePointTest::release_point() {
  
  ::route_guide::v1::Point* temp = _impl_.point_;
  _impl_.point_ = nullptr;
#ifdef PROTOBUF_FORCE_COPY_IN_RELEASE
  auto* old =  reinterpret_cast<::PROTOBUF_NAMESPACE_ID::MessageLite*>(temp);
  temp = ::PROTOBUF_NAMESPACE_ID::internal::DuplicateIfNonNull(temp);
  if (GetArenaForAllocation() == nullptr) { delete old; }
#else  // PROTOBUF_FORCE_COPY_IN_RELEASE
  if (GetArenaForAllocation() != nullptr) {
    temp = ::PROTOBUF_NAMESPACE_ID::internal::DuplicateIfNonNull(temp);
  }
#endif  // !PROTOBUF_FORCE_COPY_IN_RELEASE
  return temp;
}
inline ::route_guide::v1::Point* RoutePointTest::unsafe_arena_release_point() {
  // @@protoc_insertion_point(field_release:route_guide.v1.RoutePointTest.point)
  
  ::route_guide::v1::Point* temp = _impl_.point_;
  _impl_.point_ = nullptr;
  return temp;
}
inline ::route_guide::v1::Point* RoutePointTest::_internal_mutable_point() {
  
  if (_impl_.point_ == nullptr) {
    auto* p = CreateMaybeMessage<::route_guide::v1::Point>(GetArenaForAllocation());
    _impl_.point_ = p;
  }
  return _impl_.point_;
}
inline ::route_guide::v1::Point* RoutePointTest::mutable_point() {
  ::route_guide::v1::Point* _msg = _internal_mutable_point();
  // @@protoc_insertion_point(field_mutable:route_guide.v1.RoutePointTest.point)
  return _msg;
}
inline void RoutePointTest::set_allocated_point(::route_guide::v1::Point* point) {
  ::PROTOBUF_NAMESPACE_ID::Arena* message_arena = GetArenaForAllocation();
  if (message_arena == nullptr) {
    delete reinterpret_cast< ::PROTOBUF_NAMESPACE_ID::MessageLite*>(_impl_.point_);
  }
  if (point) {
    ::PROTOBUF_NAMESPACE_ID::Arena* submessage_arena =
        ::PROTOBUF_NAMESPACE_ID::Arena::InternalGetOwningArena(
                reinterpret_cast<::PROTOBUF_NAMESPACE_ID::MessageLite*>(point));
    if (message_arena != submessage_arena) {
      point = ::PROTOBUF_NAMESPACE_ID::internal::GetOwnedMessage(
          message_arena, point, submessage_arena);
    }

  } else {

  }
  _impl_.point_ = point;
  // @@protoc_insertion_point(field_set_allocated:route_guide.v1.RoutePointTest.point)
}

#ifdef __GNUC__
#pragma GCC diagnostic pop
#endif  // __GNUC__

// @@protoc_insertion_point(namespace_scope)
}  // namespace v1
}  // namespace route_guide


// @@protoc_insertion_point(global_scope)

#include "google/protobuf/port_undef.inc"

#endif  // GOOGLE_PROTOBUF_INCLUDED_route_5fguide_2fv1_2fstuff_2eproto_2epb_2eh
