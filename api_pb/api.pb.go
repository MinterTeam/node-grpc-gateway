// Code generated by protoc-gen-go. DO NOT EDIT.
// versions:
// 	protoc-gen-go v1.25.0
// 	protoc        v3.14.0
// source: api.proto

package api_pb

import (
	proto "github.com/golang/protobuf/proto"
	_ "github.com/grpc-ecosystem/grpc-gateway/v2/protoc-gen-openapiv2/options"
	_ "google.golang.org/genproto/googleapis/api/annotations"
	protoreflect "google.golang.org/protobuf/reflect/protoreflect"
	protoimpl "google.golang.org/protobuf/runtime/protoimpl"
	emptypb "google.golang.org/protobuf/types/known/emptypb"
	reflect "reflect"
)

const (
	// Verify that this generated code is sufficiently up-to-date.
	_ = protoimpl.EnforceVersion(20 - protoimpl.MinVersion)
	// Verify that runtime/protoimpl is sufficiently up-to-date.
	_ = protoimpl.EnforceVersion(protoimpl.MaxVersion - 20)
)

// This is a compile-time assertion that a sufficiently up-to-date version
// of the legacy proto package is being used.
const _ = proto.ProtoPackageIsVersion4

var File_api_proto protoreflect.FileDescriptor

var file_api_proto_rawDesc = []byte{
	0x0a, 0x09, 0x61, 0x70, 0x69, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x12, 0x06, 0x61, 0x70, 0x69,
	0x5f, 0x70, 0x62, 0x1a, 0x1b, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2f, 0x70, 0x72, 0x6f, 0x74,
	0x6f, 0x62, 0x75, 0x66, 0x2f, 0x65, 0x6d, 0x70, 0x74, 0x79, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f,
	0x1a, 0x0f, 0x72, 0x65, 0x73, 0x6f, 0x75, 0x72, 0x63, 0x65, 0x73, 0x2e, 0x70, 0x72, 0x6f, 0x74,
	0x6f, 0x1a, 0x1c, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2f, 0x61, 0x70, 0x69, 0x2f, 0x61, 0x6e,
	0x6e, 0x6f, 0x74, 0x61, 0x74, 0x69, 0x6f, 0x6e, 0x73, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x1a,
	0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x63, 0x2d, 0x67, 0x65, 0x6e, 0x2d, 0x6f, 0x70, 0x65, 0x6e,
	0x61, 0x70, 0x69, 0x76, 0x32, 0x2f, 0x6f, 0x70, 0x74, 0x69, 0x6f, 0x6e, 0x73, 0x2f, 0x61, 0x6e,
	0x6e, 0x6f, 0x74, 0x61, 0x74, 0x69, 0x6f, 0x6e, 0x73, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x32,
	0xed, 0x15, 0x0a, 0x0a, 0x41, 0x70, 0x69, 0x53, 0x65, 0x72, 0x76, 0x69, 0x63, 0x65, 0x12, 0x56,
	0x0a, 0x09, 0x53, 0x75, 0x62, 0x73, 0x63, 0x72, 0x69, 0x62, 0x65, 0x12, 0x18, 0x2e, 0x61, 0x70,
	0x69, 0x5f, 0x70, 0x62, 0x2e, 0x53, 0x75, 0x62, 0x73, 0x63, 0x72, 0x69, 0x62, 0x65, 0x52, 0x65,
	0x71, 0x75, 0x65, 0x73, 0x74, 0x1a, 0x19, 0x2e, 0x61, 0x70, 0x69, 0x5f, 0x70, 0x62, 0x2e, 0x53,
	0x75, 0x62, 0x73, 0x63, 0x72, 0x69, 0x62, 0x65, 0x52, 0x65, 0x73, 0x70, 0x6f, 0x6e, 0x73, 0x65,
	0x22, 0x12, 0x82, 0xd3, 0xe4, 0x93, 0x02, 0x0c, 0x12, 0x0a, 0x2f, 0x73, 0x75, 0x62, 0x73, 0x63,
	0x72, 0x69, 0x62, 0x65, 0x30, 0x01, 0x12, 0x4d, 0x0a, 0x05, 0x48, 0x61, 0x6c, 0x74, 0x73, 0x12,
	0x14, 0x2e, 0x61, 0x70, 0x69, 0x5f, 0x70, 0x62, 0x2e, 0x48, 0x61, 0x6c, 0x74, 0x73, 0x52, 0x65,
	0x71, 0x75, 0x65, 0x73, 0x74, 0x1a, 0x15, 0x2e, 0x61, 0x70, 0x69, 0x5f, 0x70, 0x62, 0x2e, 0x48,
	0x61, 0x6c, 0x74, 0x73, 0x52, 0x65, 0x73, 0x70, 0x6f, 0x6e, 0x73, 0x65, 0x22, 0x17, 0x82, 0xd3,
	0xe4, 0x93, 0x02, 0x11, 0x12, 0x0f, 0x2f, 0x68, 0x61, 0x6c, 0x74, 0x73, 0x2f, 0x7b, 0x68, 0x65,
	0x69, 0x67, 0x68, 0x74, 0x7d, 0x12, 0x4c, 0x0a, 0x07, 0x47, 0x65, 0x6e, 0x65, 0x73, 0x69, 0x73,
	0x12, 0x16, 0x2e, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x62,
	0x75, 0x66, 0x2e, 0x45, 0x6d, 0x70, 0x74, 0x79, 0x1a, 0x17, 0x2e, 0x61, 0x70, 0x69, 0x5f, 0x70,
	0x62, 0x2e, 0x47, 0x65, 0x6e, 0x65, 0x73, 0x69, 0x73, 0x52, 0x65, 0x73, 0x70, 0x6f, 0x6e, 0x73,
	0x65, 0x22, 0x10, 0x82, 0xd3, 0xe4, 0x93, 0x02, 0x0a, 0x12, 0x08, 0x2f, 0x67, 0x65, 0x6e, 0x65,
	0x73, 0x69, 0x73, 0x12, 0x5a, 0x0a, 0x0b, 0x4d, 0x69, 0x6e, 0x47, 0x61, 0x73, 0x50, 0x72, 0x69,
	0x63, 0x65, 0x12, 0x16, 0x2e, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2e, 0x70, 0x72, 0x6f, 0x74,
	0x6f, 0x62, 0x75, 0x66, 0x2e, 0x45, 0x6d, 0x70, 0x74, 0x79, 0x1a, 0x1b, 0x2e, 0x61, 0x70, 0x69,
	0x5f, 0x70, 0x62, 0x2e, 0x4d, 0x69, 0x6e, 0x47, 0x61, 0x73, 0x50, 0x72, 0x69, 0x63, 0x65, 0x52,
	0x65, 0x73, 0x70, 0x6f, 0x6e, 0x73, 0x65, 0x22, 0x16, 0x82, 0xd3, 0xe4, 0x93, 0x02, 0x10, 0x12,
	0x0e, 0x2f, 0x6d, 0x69, 0x6e, 0x5f, 0x67, 0x61, 0x73, 0x5f, 0x70, 0x72, 0x69, 0x63, 0x65, 0x12,
	0x4d, 0x0a, 0x07, 0x4e, 0x65, 0x74, 0x49, 0x6e, 0x66, 0x6f, 0x12, 0x16, 0x2e, 0x67, 0x6f, 0x6f,
	0x67, 0x6c, 0x65, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x62, 0x75, 0x66, 0x2e, 0x45, 0x6d, 0x70,
	0x74, 0x79, 0x1a, 0x17, 0x2e, 0x61, 0x70, 0x69, 0x5f, 0x70, 0x62, 0x2e, 0x4e, 0x65, 0x74, 0x49,
	0x6e, 0x66, 0x6f, 0x52, 0x65, 0x73, 0x70, 0x6f, 0x6e, 0x73, 0x65, 0x22, 0x11, 0x82, 0xd3, 0xe4,
	0x93, 0x02, 0x0b, 0x12, 0x09, 0x2f, 0x6e, 0x65, 0x74, 0x5f, 0x69, 0x6e, 0x66, 0x6f, 0x12, 0x49,
	0x0a, 0x06, 0x53, 0x74, 0x61, 0x74, 0x75, 0x73, 0x12, 0x16, 0x2e, 0x67, 0x6f, 0x6f, 0x67, 0x6c,
	0x65, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x62, 0x75, 0x66, 0x2e, 0x45, 0x6d, 0x70, 0x74, 0x79,
	0x1a, 0x16, 0x2e, 0x61, 0x70, 0x69, 0x5f, 0x70, 0x62, 0x2e, 0x53, 0x74, 0x61, 0x74, 0x75, 0x73,
	0x52, 0x65, 0x73, 0x70, 0x6f, 0x6e, 0x73, 0x65, 0x22, 0x0f, 0x82, 0xd3, 0xe4, 0x93, 0x02, 0x09,
	0x12, 0x07, 0x2f, 0x73, 0x74, 0x61, 0x74, 0x75, 0x73, 0x12, 0x56, 0x0a, 0x07, 0x41, 0x64, 0x64,
	0x72, 0x65, 0x73, 0x73, 0x12, 0x16, 0x2e, 0x61, 0x70, 0x69, 0x5f, 0x70, 0x62, 0x2e, 0x41, 0x64,
	0x64, 0x72, 0x65, 0x73, 0x73, 0x52, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x1a, 0x17, 0x2e, 0x61,
	0x70, 0x69, 0x5f, 0x70, 0x62, 0x2e, 0x41, 0x64, 0x64, 0x72, 0x65, 0x73, 0x73, 0x52, 0x65, 0x73,
	0x70, 0x6f, 0x6e, 0x73, 0x65, 0x22, 0x1a, 0x82, 0xd3, 0xe4, 0x93, 0x02, 0x14, 0x12, 0x12, 0x2f,
	0x61, 0x64, 0x64, 0x72, 0x65, 0x73, 0x73, 0x2f, 0x7b, 0x61, 0x64, 0x64, 0x72, 0x65, 0x73, 0x73,
	0x7d, 0x12, 0x54, 0x0a, 0x09, 0x41, 0x64, 0x64, 0x72, 0x65, 0x73, 0x73, 0x65, 0x73, 0x12, 0x18,
	0x2e, 0x61, 0x70, 0x69, 0x5f, 0x70, 0x62, 0x2e, 0x41, 0x64, 0x64, 0x72, 0x65, 0x73, 0x73, 0x65,
	0x73, 0x52, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x1a, 0x19, 0x2e, 0x61, 0x70, 0x69, 0x5f, 0x70,
	0x62, 0x2e, 0x41, 0x64, 0x64, 0x72, 0x65, 0x73, 0x73, 0x65, 0x73, 0x52, 0x65, 0x73, 0x70, 0x6f,
	0x6e, 0x73, 0x65, 0x22, 0x12, 0x82, 0xd3, 0xe4, 0x93, 0x02, 0x0c, 0x12, 0x0a, 0x2f, 0x61, 0x64,
	0x64, 0x72, 0x65, 0x73, 0x73, 0x65, 0x73, 0x12, 0x4d, 0x0a, 0x05, 0x42, 0x6c, 0x6f, 0x63, 0x6b,
	0x12, 0x14, 0x2e, 0x61, 0x70, 0x69, 0x5f, 0x70, 0x62, 0x2e, 0x42, 0x6c, 0x6f, 0x63, 0x6b, 0x52,
	0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x1a, 0x15, 0x2e, 0x61, 0x70, 0x69, 0x5f, 0x70, 0x62, 0x2e,
	0x42, 0x6c, 0x6f, 0x63, 0x6b, 0x52, 0x65, 0x73, 0x70, 0x6f, 0x6e, 0x73, 0x65, 0x22, 0x17, 0x82,
	0xd3, 0xe4, 0x93, 0x02, 0x11, 0x12, 0x0f, 0x2f, 0x62, 0x6c, 0x6f, 0x63, 0x6b, 0x2f, 0x7b, 0x68,
	0x65, 0x69, 0x67, 0x68, 0x74, 0x7d, 0x12, 0x61, 0x0a, 0x09, 0x43, 0x61, 0x6e, 0x64, 0x69, 0x64,
	0x61, 0x74, 0x65, 0x12, 0x18, 0x2e, 0x61, 0x70, 0x69, 0x5f, 0x70, 0x62, 0x2e, 0x43, 0x61, 0x6e,
	0x64, 0x69, 0x64, 0x61, 0x74, 0x65, 0x52, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x1a, 0x19, 0x2e,
	0x61, 0x70, 0x69, 0x5f, 0x70, 0x62, 0x2e, 0x43, 0x61, 0x6e, 0x64, 0x69, 0x64, 0x61, 0x74, 0x65,
	0x52, 0x65, 0x73, 0x70, 0x6f, 0x6e, 0x73, 0x65, 0x22, 0x1f, 0x82, 0xd3, 0xe4, 0x93, 0x02, 0x19,
	0x12, 0x17, 0x2f, 0x63, 0x61, 0x6e, 0x64, 0x69, 0x64, 0x61, 0x74, 0x65, 0x2f, 0x7b, 0x70, 0x75,
	0x62, 0x6c, 0x69, 0x63, 0x5f, 0x6b, 0x65, 0x79, 0x7d, 0x12, 0x58, 0x0a, 0x0a, 0x43, 0x61, 0x6e,
	0x64, 0x69, 0x64, 0x61, 0x74, 0x65, 0x73, 0x12, 0x19, 0x2e, 0x61, 0x70, 0x69, 0x5f, 0x70, 0x62,
	0x2e, 0x43, 0x61, 0x6e, 0x64, 0x69, 0x64, 0x61, 0x74, 0x65, 0x73, 0x52, 0x65, 0x71, 0x75, 0x65,
	0x73, 0x74, 0x1a, 0x1a, 0x2e, 0x61, 0x70, 0x69, 0x5f, 0x70, 0x62, 0x2e, 0x43, 0x61, 0x6e, 0x64,
	0x69, 0x64, 0x61, 0x74, 0x65, 0x73, 0x52, 0x65, 0x73, 0x70, 0x6f, 0x6e, 0x73, 0x65, 0x22, 0x13,
	0x82, 0xd3, 0xe4, 0x93, 0x02, 0x0d, 0x12, 0x0b, 0x2f, 0x63, 0x61, 0x6e, 0x64, 0x69, 0x64, 0x61,
	0x74, 0x65, 0x73, 0x12, 0x5e, 0x0a, 0x0c, 0x43, 0x6f, 0x69, 0x6e, 0x49, 0x6e, 0x66, 0x6f, 0x42,
	0x79, 0x49, 0x64, 0x12, 0x15, 0x2e, 0x61, 0x70, 0x69, 0x5f, 0x70, 0x62, 0x2e, 0x43, 0x6f, 0x69,
	0x6e, 0x49, 0x64, 0x52, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x1a, 0x18, 0x2e, 0x61, 0x70, 0x69,
	0x5f, 0x70, 0x62, 0x2e, 0x43, 0x6f, 0x69, 0x6e, 0x49, 0x6e, 0x66, 0x6f, 0x52, 0x65, 0x73, 0x70,
	0x6f, 0x6e, 0x73, 0x65, 0x22, 0x1d, 0x82, 0xd3, 0xe4, 0x93, 0x02, 0x17, 0x12, 0x15, 0x2f, 0x63,
	0x6f, 0x69, 0x6e, 0x5f, 0x69, 0x6e, 0x66, 0x6f, 0x5f, 0x62, 0x79, 0x5f, 0x69, 0x64, 0x2f, 0x7b,
	0x69, 0x64, 0x7d, 0x12, 0x5a, 0x0a, 0x08, 0x43, 0x6f, 0x69, 0x6e, 0x49, 0x6e, 0x66, 0x6f, 0x12,
	0x17, 0x2e, 0x61, 0x70, 0x69, 0x5f, 0x70, 0x62, 0x2e, 0x43, 0x6f, 0x69, 0x6e, 0x49, 0x6e, 0x66,
	0x6f, 0x52, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x1a, 0x18, 0x2e, 0x61, 0x70, 0x69, 0x5f, 0x70,
	0x62, 0x2e, 0x43, 0x6f, 0x69, 0x6e, 0x49, 0x6e, 0x66, 0x6f, 0x52, 0x65, 0x73, 0x70, 0x6f, 0x6e,
	0x73, 0x65, 0x22, 0x1b, 0x82, 0xd3, 0xe4, 0x93, 0x02, 0x15, 0x12, 0x13, 0x2f, 0x63, 0x6f, 0x69,
	0x6e, 0x5f, 0x69, 0x6e, 0x66, 0x6f, 0x2f, 0x7b, 0x73, 0x79, 0x6d, 0x62, 0x6f, 0x6c, 0x7d, 0x12,
	0x6e, 0x0a, 0x0f, 0x45, 0x73, 0x74, 0x69, 0x6d, 0x61, 0x74, 0x65, 0x43, 0x6f, 0x69, 0x6e, 0x42,
	0x75, 0x79, 0x12, 0x1e, 0x2e, 0x61, 0x70, 0x69, 0x5f, 0x70, 0x62, 0x2e, 0x45, 0x73, 0x74, 0x69,
	0x6d, 0x61, 0x74, 0x65, 0x43, 0x6f, 0x69, 0x6e, 0x42, 0x75, 0x79, 0x52, 0x65, 0x71, 0x75, 0x65,
	0x73, 0x74, 0x1a, 0x1f, 0x2e, 0x61, 0x70, 0x69, 0x5f, 0x70, 0x62, 0x2e, 0x45, 0x73, 0x74, 0x69,
	0x6d, 0x61, 0x74, 0x65, 0x43, 0x6f, 0x69, 0x6e, 0x42, 0x75, 0x79, 0x52, 0x65, 0x73, 0x70, 0x6f,
	0x6e, 0x73, 0x65, 0x22, 0x1a, 0x82, 0xd3, 0xe4, 0x93, 0x02, 0x14, 0x12, 0x12, 0x2f, 0x65, 0x73,
	0x74, 0x69, 0x6d, 0x61, 0x74, 0x65, 0x5f, 0x63, 0x6f, 0x69, 0x6e, 0x5f, 0x62, 0x75, 0x79, 0x12,
	0x72, 0x0a, 0x10, 0x45, 0x73, 0x74, 0x69, 0x6d, 0x61, 0x74, 0x65, 0x43, 0x6f, 0x69, 0x6e, 0x53,
	0x65, 0x6c, 0x6c, 0x12, 0x1f, 0x2e, 0x61, 0x70, 0x69, 0x5f, 0x70, 0x62, 0x2e, 0x45, 0x73, 0x74,
	0x69, 0x6d, 0x61, 0x74, 0x65, 0x43, 0x6f, 0x69, 0x6e, 0x53, 0x65, 0x6c, 0x6c, 0x52, 0x65, 0x71,
	0x75, 0x65, 0x73, 0x74, 0x1a, 0x20, 0x2e, 0x61, 0x70, 0x69, 0x5f, 0x70, 0x62, 0x2e, 0x45, 0x73,
	0x74, 0x69, 0x6d, 0x61, 0x74, 0x65, 0x43, 0x6f, 0x69, 0x6e, 0x53, 0x65, 0x6c, 0x6c, 0x52, 0x65,
	0x73, 0x70, 0x6f, 0x6e, 0x73, 0x65, 0x22, 0x1b, 0x82, 0xd3, 0xe4, 0x93, 0x02, 0x15, 0x12, 0x13,
	0x2f, 0x65, 0x73, 0x74, 0x69, 0x6d, 0x61, 0x74, 0x65, 0x5f, 0x63, 0x6f, 0x69, 0x6e, 0x5f, 0x73,
	0x65, 0x6c, 0x6c, 0x12, 0x7f, 0x0a, 0x13, 0x45, 0x73, 0x74, 0x69, 0x6d, 0x61, 0x74, 0x65, 0x43,
	0x6f, 0x69, 0x6e, 0x53, 0x65, 0x6c, 0x6c, 0x41, 0x6c, 0x6c, 0x12, 0x22, 0x2e, 0x61, 0x70, 0x69,
	0x5f, 0x70, 0x62, 0x2e, 0x45, 0x73, 0x74, 0x69, 0x6d, 0x61, 0x74, 0x65, 0x43, 0x6f, 0x69, 0x6e,
	0x53, 0x65, 0x6c, 0x6c, 0x41, 0x6c, 0x6c, 0x52, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x1a, 0x23,
	0x2e, 0x61, 0x70, 0x69, 0x5f, 0x70, 0x62, 0x2e, 0x45, 0x73, 0x74, 0x69, 0x6d, 0x61, 0x74, 0x65,
	0x43, 0x6f, 0x69, 0x6e, 0x53, 0x65, 0x6c, 0x6c, 0x41, 0x6c, 0x6c, 0x52, 0x65, 0x73, 0x70, 0x6f,
	0x6e, 0x73, 0x65, 0x22, 0x1f, 0x82, 0xd3, 0xe4, 0x93, 0x02, 0x19, 0x12, 0x17, 0x2f, 0x65, 0x73,
	0x74, 0x69, 0x6d, 0x61, 0x74, 0x65, 0x5f, 0x63, 0x6f, 0x69, 0x6e, 0x5f, 0x73, 0x65, 0x6c, 0x6c,
	0x5f, 0x61, 0x6c, 0x6c, 0x12, 0x87, 0x01, 0x0a, 0x14, 0x45, 0x73, 0x74, 0x69, 0x6d, 0x61, 0x74,
	0x65, 0x54, 0x78, 0x43, 0x6f, 0x6d, 0x6d, 0x69, 0x73, 0x73, 0x69, 0x6f, 0x6e, 0x12, 0x23, 0x2e,
	0x61, 0x70, 0x69, 0x5f, 0x70, 0x62, 0x2e, 0x45, 0x73, 0x74, 0x69, 0x6d, 0x61, 0x74, 0x65, 0x54,
	0x78, 0x43, 0x6f, 0x6d, 0x6d, 0x69, 0x73, 0x73, 0x69, 0x6f, 0x6e, 0x52, 0x65, 0x71, 0x75, 0x65,
	0x73, 0x74, 0x1a, 0x24, 0x2e, 0x61, 0x70, 0x69, 0x5f, 0x70, 0x62, 0x2e, 0x45, 0x73, 0x74, 0x69,
	0x6d, 0x61, 0x74, 0x65, 0x54, 0x78, 0x43, 0x6f, 0x6d, 0x6d, 0x69, 0x73, 0x73, 0x69, 0x6f, 0x6e,
	0x52, 0x65, 0x73, 0x70, 0x6f, 0x6e, 0x73, 0x65, 0x22, 0x24, 0x82, 0xd3, 0xe4, 0x93, 0x02, 0x1e,
	0x12, 0x1c, 0x2f, 0x65, 0x73, 0x74, 0x69, 0x6d, 0x61, 0x74, 0x65, 0x5f, 0x74, 0x78, 0x5f, 0x63,
	0x6f, 0x6d, 0x6d, 0x69, 0x73, 0x73, 0x69, 0x6f, 0x6e, 0x2f, 0x7b, 0x74, 0x78, 0x7d, 0x12, 0x51,
	0x0a, 0x06, 0x45, 0x76, 0x65, 0x6e, 0x74, 0x73, 0x12, 0x15, 0x2e, 0x61, 0x70, 0x69, 0x5f, 0x70,
	0x62, 0x2e, 0x45, 0x76, 0x65, 0x6e, 0x74, 0x73, 0x52, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x1a,
	0x16, 0x2e, 0x61, 0x70, 0x69, 0x5f, 0x70, 0x62, 0x2e, 0x45, 0x76, 0x65, 0x6e, 0x74, 0x73, 0x52,
	0x65, 0x73, 0x70, 0x6f, 0x6e, 0x73, 0x65, 0x22, 0x18, 0x82, 0xd3, 0xe4, 0x93, 0x02, 0x12, 0x12,
	0x10, 0x2f, 0x65, 0x76, 0x65, 0x6e, 0x74, 0x73, 0x2f, 0x7b, 0x68, 0x65, 0x69, 0x67, 0x68, 0x74,
	0x7d, 0x12, 0x5e, 0x0a, 0x0b, 0x4d, 0x61, 0x78, 0x47, 0x61, 0x73, 0x50, 0x72, 0x69, 0x63, 0x65,
	0x12, 0x1a, 0x2e, 0x61, 0x70, 0x69, 0x5f, 0x70, 0x62, 0x2e, 0x4d, 0x61, 0x78, 0x47, 0x61, 0x73,
	0x50, 0x72, 0x69, 0x63, 0x65, 0x52, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x1a, 0x1b, 0x2e, 0x61,
	0x70, 0x69, 0x5f, 0x70, 0x62, 0x2e, 0x4d, 0x61, 0x78, 0x47, 0x61, 0x73, 0x50, 0x72, 0x69, 0x63,
	0x65, 0x52, 0x65, 0x73, 0x70, 0x6f, 0x6e, 0x73, 0x65, 0x22, 0x16, 0x82, 0xd3, 0xe4, 0x93, 0x02,
	0x10, 0x12, 0x0e, 0x2f, 0x6d, 0x61, 0x78, 0x5f, 0x67, 0x61, 0x73, 0x5f, 0x70, 0x72, 0x69, 0x63,
	0x65, 0x12, 0x6e, 0x0a, 0x0c, 0x4d, 0x69, 0x73, 0x73, 0x65, 0x64, 0x42, 0x6c, 0x6f, 0x63, 0x6b,
	0x73, 0x12, 0x1b, 0x2e, 0x61, 0x70, 0x69, 0x5f, 0x70, 0x62, 0x2e, 0x4d, 0x69, 0x73, 0x73, 0x65,
	0x64, 0x42, 0x6c, 0x6f, 0x63, 0x6b, 0x73, 0x52, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x1a, 0x1c,
	0x2e, 0x61, 0x70, 0x69, 0x5f, 0x70, 0x62, 0x2e, 0x4d, 0x69, 0x73, 0x73, 0x65, 0x64, 0x42, 0x6c,
	0x6f, 0x63, 0x6b, 0x73, 0x52, 0x65, 0x73, 0x70, 0x6f, 0x6e, 0x73, 0x65, 0x22, 0x23, 0x82, 0xd3,
	0xe4, 0x93, 0x02, 0x1d, 0x12, 0x1b, 0x2f, 0x6d, 0x69, 0x73, 0x73, 0x65, 0x64, 0x5f, 0x62, 0x6c,
	0x6f, 0x63, 0x6b, 0x73, 0x2f, 0x7b, 0x70, 0x75, 0x62, 0x6c, 0x69, 0x63, 0x5f, 0x6b, 0x65, 0x79,
	0x7d, 0x12, 0xde, 0x01, 0x0a, 0x0f, 0x53, 0x65, 0x6e, 0x64, 0x54, 0x72, 0x61, 0x6e, 0x73, 0x61,
	0x63, 0x74, 0x69, 0x6f, 0x6e, 0x12, 0x1e, 0x2e, 0x61, 0x70, 0x69, 0x5f, 0x70, 0x62, 0x2e, 0x53,
	0x65, 0x6e, 0x64, 0x54, 0x72, 0x61, 0x6e, 0x73, 0x61, 0x63, 0x74, 0x69, 0x6f, 0x6e, 0x52, 0x65,
	0x71, 0x75, 0x65, 0x73, 0x74, 0x1a, 0x1f, 0x2e, 0x61, 0x70, 0x69, 0x5f, 0x70, 0x62, 0x2e, 0x53,
	0x65, 0x6e, 0x64, 0x54, 0x72, 0x61, 0x6e, 0x73, 0x61, 0x63, 0x74, 0x69, 0x6f, 0x6e, 0x52, 0x65,
	0x73, 0x70, 0x6f, 0x6e, 0x73, 0x65, 0x22, 0x89, 0x01, 0x82, 0xd3, 0xe4, 0x93, 0x02, 0x30, 0x12,
	0x16, 0x2f, 0x73, 0x65, 0x6e, 0x64, 0x5f, 0x74, 0x72, 0x61, 0x6e, 0x73, 0x61, 0x63, 0x74, 0x69,
	0x6f, 0x6e, 0x2f, 0x7b, 0x74, 0x78, 0x7d, 0x5a, 0x16, 0x22, 0x11, 0x2f, 0x73, 0x65, 0x6e, 0x64,
	0x5f, 0x74, 0x72, 0x61, 0x6e, 0x73, 0x61, 0x63, 0x74, 0x69, 0x6f, 0x6e, 0x3a, 0x01, 0x2a, 0x92,
	0x41, 0x50, 0x22, 0x4e, 0x0a, 0x1e, 0x4d, 0x6f, 0x72, 0x65, 0x20, 0x61, 0x62, 0x6f, 0x75, 0x74,
	0x20, 0x4d, 0x69, 0x6e, 0x74, 0x65, 0x72, 0x20, 0x74, 0x72, 0x61, 0x6e, 0x73, 0x61, 0x63, 0x74,
	0x69, 0x6f, 0x6e, 0x73, 0x12, 0x2c, 0x68, 0x74, 0x74, 0x70, 0x73, 0x3a, 0x2f, 0x2f, 0x77, 0x77,
	0x77, 0x2e, 0x6d, 0x69, 0x6e, 0x74, 0x65, 0x72, 0x2e, 0x6e, 0x65, 0x74, 0x77, 0x6f, 0x72, 0x6b,
	0x2f, 0x64, 0x6f, 0x63, 0x73, 0x23, 0x74, 0x72, 0x61, 0x6e, 0x73, 0x61, 0x63, 0x74, 0x69, 0x6f,
	0x6e, 0x73, 0x12, 0x63, 0x0a, 0x0b, 0x54, 0x72, 0x61, 0x6e, 0x73, 0x61, 0x63, 0x74, 0x69, 0x6f,
	0x6e, 0x12, 0x1a, 0x2e, 0x61, 0x70, 0x69, 0x5f, 0x70, 0x62, 0x2e, 0x54, 0x72, 0x61, 0x6e, 0x73,
	0x61, 0x63, 0x74, 0x69, 0x6f, 0x6e, 0x52, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x1a, 0x1b, 0x2e,
	0x61, 0x70, 0x69, 0x5f, 0x70, 0x62, 0x2e, 0x54, 0x72, 0x61, 0x6e, 0x73, 0x61, 0x63, 0x74, 0x69,
	0x6f, 0x6e, 0x52, 0x65, 0x73, 0x70, 0x6f, 0x6e, 0x73, 0x65, 0x22, 0x1b, 0x82, 0xd3, 0xe4, 0x93,
	0x02, 0x15, 0x12, 0x13, 0x2f, 0x74, 0x72, 0x61, 0x6e, 0x73, 0x61, 0x63, 0x74, 0x69, 0x6f, 0x6e,
	0x2f, 0x7b, 0x68, 0x61, 0x73, 0x68, 0x7d, 0x12, 0x60, 0x0a, 0x0c, 0x54, 0x72, 0x61, 0x6e, 0x73,
	0x61, 0x63, 0x74, 0x69, 0x6f, 0x6e, 0x73, 0x12, 0x1b, 0x2e, 0x61, 0x70, 0x69, 0x5f, 0x70, 0x62,
	0x2e, 0x54, 0x72, 0x61, 0x6e, 0x73, 0x61, 0x63, 0x74, 0x69, 0x6f, 0x6e, 0x73, 0x52, 0x65, 0x71,
	0x75, 0x65, 0x73, 0x74, 0x1a, 0x1c, 0x2e, 0x61, 0x70, 0x69, 0x5f, 0x70, 0x62, 0x2e, 0x54, 0x72,
	0x61, 0x6e, 0x73, 0x61, 0x63, 0x74, 0x69, 0x6f, 0x6e, 0x73, 0x52, 0x65, 0x73, 0x70, 0x6f, 0x6e,
	0x73, 0x65, 0x22, 0x15, 0x82, 0xd3, 0xe4, 0x93, 0x02, 0x0f, 0x12, 0x0d, 0x2f, 0x74, 0x72, 0x61,
	0x6e, 0x73, 0x61, 0x63, 0x74, 0x69, 0x6f, 0x6e, 0x73, 0x12, 0x69, 0x0a, 0x0e, 0x55, 0x6e, 0x63,
	0x6f, 0x6e, 0x66, 0x69, 0x72, 0x6d, 0x65, 0x64, 0x54, 0x78, 0x73, 0x12, 0x1d, 0x2e, 0x61, 0x70,
	0x69, 0x5f, 0x70, 0x62, 0x2e, 0x55, 0x6e, 0x63, 0x6f, 0x6e, 0x66, 0x69, 0x72, 0x6d, 0x65, 0x64,
	0x54, 0x78, 0x73, 0x52, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x1a, 0x1e, 0x2e, 0x61, 0x70, 0x69,
	0x5f, 0x70, 0x62, 0x2e, 0x55, 0x6e, 0x63, 0x6f, 0x6e, 0x66, 0x69, 0x72, 0x6d, 0x65, 0x64, 0x54,
	0x78, 0x73, 0x52, 0x65, 0x73, 0x70, 0x6f, 0x6e, 0x73, 0x65, 0x22, 0x18, 0x82, 0xd3, 0xe4, 0x93,
	0x02, 0x12, 0x12, 0x10, 0x2f, 0x75, 0x6e, 0x63, 0x6f, 0x6e, 0x66, 0x69, 0x72, 0x6d, 0x65, 0x64,
	0x5f, 0x74, 0x78, 0x73, 0x12, 0x58, 0x0a, 0x0a, 0x56, 0x61, 0x6c, 0x69, 0x64, 0x61, 0x74, 0x6f,
	0x72, 0x73, 0x12, 0x19, 0x2e, 0x61, 0x70, 0x69, 0x5f, 0x70, 0x62, 0x2e, 0x56, 0x61, 0x6c, 0x69,
	0x64, 0x61, 0x74, 0x6f, 0x72, 0x73, 0x52, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x1a, 0x1a, 0x2e,
	0x61, 0x70, 0x69, 0x5f, 0x70, 0x62, 0x2e, 0x56, 0x61, 0x6c, 0x69, 0x64, 0x61, 0x74, 0x6f, 0x72,
	0x73, 0x52, 0x65, 0x73, 0x70, 0x6f, 0x6e, 0x73, 0x65, 0x22, 0x13, 0x82, 0xd3, 0xe4, 0x93, 0x02,
	0x0d, 0x12, 0x0b, 0x2f, 0x76, 0x61, 0x6c, 0x69, 0x64, 0x61, 0x74, 0x6f, 0x72, 0x73, 0x12, 0x52,
	0x0a, 0x06, 0x46, 0x72, 0x6f, 0x7a, 0x65, 0x6e, 0x12, 0x15, 0x2e, 0x61, 0x70, 0x69, 0x5f, 0x70,
	0x62, 0x2e, 0x46, 0x72, 0x6f, 0x7a, 0x65, 0x6e, 0x52, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x1a,
	0x16, 0x2e, 0x61, 0x70, 0x69, 0x5f, 0x70, 0x62, 0x2e, 0x46, 0x72, 0x6f, 0x7a, 0x65, 0x6e, 0x52,
	0x65, 0x73, 0x70, 0x6f, 0x6e, 0x73, 0x65, 0x22, 0x19, 0x82, 0xd3, 0xe4, 0x93, 0x02, 0x13, 0x12,
	0x11, 0x2f, 0x66, 0x72, 0x6f, 0x7a, 0x65, 0x6e, 0x2f, 0x7b, 0x61, 0x64, 0x64, 0x72, 0x65, 0x73,
	0x73, 0x7d, 0x12, 0x5a, 0x0a, 0x08, 0x57, 0x61, 0x69, 0x74, 0x4c, 0x69, 0x73, 0x74, 0x12, 0x17,
	0x2e, 0x61, 0x70, 0x69, 0x5f, 0x70, 0x62, 0x2e, 0x57, 0x61, 0x69, 0x74, 0x4c, 0x69, 0x73, 0x74,
	0x52, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x1a, 0x18, 0x2e, 0x61, 0x70, 0x69, 0x5f, 0x70, 0x62,
	0x2e, 0x57, 0x61, 0x69, 0x74, 0x4c, 0x69, 0x73, 0x74, 0x52, 0x65, 0x73, 0x70, 0x6f, 0x6e, 0x73,
	0x65, 0x22, 0x1b, 0x82, 0xd3, 0xe4, 0x93, 0x02, 0x15, 0x12, 0x13, 0x2f, 0x77, 0x61, 0x69, 0x74,
	0x6c, 0x69, 0x73, 0x74, 0x2f, 0x7b, 0x61, 0x64, 0x64, 0x72, 0x65, 0x73, 0x73, 0x7d, 0x12, 0x4f,
	0x0a, 0x09, 0x54, 0x65, 0x73, 0x74, 0x42, 0x6c, 0x6f, 0x63, 0x6b, 0x12, 0x16, 0x2e, 0x67, 0x6f,
	0x6f, 0x67, 0x6c, 0x65, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x62, 0x75, 0x66, 0x2e, 0x45, 0x6d,
	0x70, 0x74, 0x79, 0x1a, 0x15, 0x2e, 0x61, 0x70, 0x69, 0x5f, 0x70, 0x62, 0x2e, 0x42, 0x6c, 0x6f,
	0x63, 0x6b, 0x52, 0x65, 0x73, 0x70, 0x6f, 0x6e, 0x73, 0x65, 0x22, 0x13, 0x82, 0xd3, 0xe4, 0x93,
	0x02, 0x0d, 0x12, 0x0b, 0x2f, 0x74, 0x65, 0x73, 0x74, 0x2f, 0x62, 0x6c, 0x6f, 0x63, 0x6b, 0x42,
	0x0a, 0x5a, 0x08, 0x2e, 0x3b, 0x61, 0x70, 0x69, 0x5f, 0x70, 0x62, 0x62, 0x06, 0x70, 0x72, 0x6f,
	0x74, 0x6f, 0x33,
}

var file_api_proto_goTypes = []interface{}{
	(*SubscribeRequest)(nil),             // 0: api_pb.SubscribeRequest
	(*HaltsRequest)(nil),                 // 1: api_pb.HaltsRequest
	(*emptypb.Empty)(nil),                // 2: google.protobuf.Empty
	(*AddressRequest)(nil),               // 3: api_pb.AddressRequest
	(*AddressesRequest)(nil),             // 4: api_pb.AddressesRequest
	(*BlockRequest)(nil),                 // 5: api_pb.BlockRequest
	(*CandidateRequest)(nil),             // 6: api_pb.CandidateRequest
	(*CandidatesRequest)(nil),            // 7: api_pb.CandidatesRequest
	(*CoinIdRequest)(nil),                // 8: api_pb.CoinIdRequest
	(*CoinInfoRequest)(nil),              // 9: api_pb.CoinInfoRequest
	(*EstimateCoinBuyRequest)(nil),       // 10: api_pb.EstimateCoinBuyRequest
	(*EstimateCoinSellRequest)(nil),      // 11: api_pb.EstimateCoinSellRequest
	(*EstimateCoinSellAllRequest)(nil),   // 12: api_pb.EstimateCoinSellAllRequest
	(*EstimateTxCommissionRequest)(nil),  // 13: api_pb.EstimateTxCommissionRequest
	(*EventsRequest)(nil),                // 14: api_pb.EventsRequest
	(*MaxGasPriceRequest)(nil),           // 15: api_pb.MaxGasPriceRequest
	(*MissedBlocksRequest)(nil),          // 16: api_pb.MissedBlocksRequest
	(*SendTransactionRequest)(nil),       // 17: api_pb.SendTransactionRequest
	(*TransactionRequest)(nil),           // 18: api_pb.TransactionRequest
	(*TransactionsRequest)(nil),          // 19: api_pb.TransactionsRequest
	(*UnconfirmedTxsRequest)(nil),        // 20: api_pb.UnconfirmedTxsRequest
	(*ValidatorsRequest)(nil),            // 21: api_pb.ValidatorsRequest
	(*FrozenRequest)(nil),                // 22: api_pb.FrozenRequest
	(*WaitListRequest)(nil),              // 23: api_pb.WaitListRequest
	(*SubscribeResponse)(nil),            // 24: api_pb.SubscribeResponse
	(*HaltsResponse)(nil),                // 25: api_pb.HaltsResponse
	(*GenesisResponse)(nil),              // 26: api_pb.GenesisResponse
	(*MinGasPriceResponse)(nil),          // 27: api_pb.MinGasPriceResponse
	(*NetInfoResponse)(nil),              // 28: api_pb.NetInfoResponse
	(*StatusResponse)(nil),               // 29: api_pb.StatusResponse
	(*AddressResponse)(nil),              // 30: api_pb.AddressResponse
	(*AddressesResponse)(nil),            // 31: api_pb.AddressesResponse
	(*BlockResponse)(nil),                // 32: api_pb.BlockResponse
	(*CandidateResponse)(nil),            // 33: api_pb.CandidateResponse
	(*CandidatesResponse)(nil),           // 34: api_pb.CandidatesResponse
	(*CoinInfoResponse)(nil),             // 35: api_pb.CoinInfoResponse
	(*EstimateCoinBuyResponse)(nil),      // 36: api_pb.EstimateCoinBuyResponse
	(*EstimateCoinSellResponse)(nil),     // 37: api_pb.EstimateCoinSellResponse
	(*EstimateCoinSellAllResponse)(nil),  // 38: api_pb.EstimateCoinSellAllResponse
	(*EstimateTxCommissionResponse)(nil), // 39: api_pb.EstimateTxCommissionResponse
	(*EventsResponse)(nil),               // 40: api_pb.EventsResponse
	(*MaxGasPriceResponse)(nil),          // 41: api_pb.MaxGasPriceResponse
	(*MissedBlocksResponse)(nil),         // 42: api_pb.MissedBlocksResponse
	(*SendTransactionResponse)(nil),      // 43: api_pb.SendTransactionResponse
	(*TransactionResponse)(nil),          // 44: api_pb.TransactionResponse
	(*TransactionsResponse)(nil),         // 45: api_pb.TransactionsResponse
	(*UnconfirmedTxsResponse)(nil),       // 46: api_pb.UnconfirmedTxsResponse
	(*ValidatorsResponse)(nil),           // 47: api_pb.ValidatorsResponse
	(*FrozenResponse)(nil),               // 48: api_pb.FrozenResponse
	(*WaitListResponse)(nil),             // 49: api_pb.WaitListResponse
}
var file_api_proto_depIdxs = []int32{
	0,  // 0: api_pb.ApiService.Subscribe:input_type -> api_pb.SubscribeRequest
	1,  // 1: api_pb.ApiService.Halts:input_type -> api_pb.HaltsRequest
	2,  // 2: api_pb.ApiService.Genesis:input_type -> google.protobuf.Empty
	2,  // 3: api_pb.ApiService.MinGasPrice:input_type -> google.protobuf.Empty
	2,  // 4: api_pb.ApiService.NetInfo:input_type -> google.protobuf.Empty
	2,  // 5: api_pb.ApiService.Status:input_type -> google.protobuf.Empty
	3,  // 6: api_pb.ApiService.Address:input_type -> api_pb.AddressRequest
	4,  // 7: api_pb.ApiService.Addresses:input_type -> api_pb.AddressesRequest
	5,  // 8: api_pb.ApiService.Block:input_type -> api_pb.BlockRequest
	6,  // 9: api_pb.ApiService.Candidate:input_type -> api_pb.CandidateRequest
	7,  // 10: api_pb.ApiService.Candidates:input_type -> api_pb.CandidatesRequest
	8,  // 11: api_pb.ApiService.CoinInfoById:input_type -> api_pb.CoinIdRequest
	9,  // 12: api_pb.ApiService.CoinInfo:input_type -> api_pb.CoinInfoRequest
	10, // 13: api_pb.ApiService.EstimateCoinBuy:input_type -> api_pb.EstimateCoinBuyRequest
	11, // 14: api_pb.ApiService.EstimateCoinSell:input_type -> api_pb.EstimateCoinSellRequest
	12, // 15: api_pb.ApiService.EstimateCoinSellAll:input_type -> api_pb.EstimateCoinSellAllRequest
	13, // 16: api_pb.ApiService.EstimateTxCommission:input_type -> api_pb.EstimateTxCommissionRequest
	14, // 17: api_pb.ApiService.Events:input_type -> api_pb.EventsRequest
	15, // 18: api_pb.ApiService.MaxGasPrice:input_type -> api_pb.MaxGasPriceRequest
	16, // 19: api_pb.ApiService.MissedBlocks:input_type -> api_pb.MissedBlocksRequest
	17, // 20: api_pb.ApiService.SendTransaction:input_type -> api_pb.SendTransactionRequest
	18, // 21: api_pb.ApiService.Transaction:input_type -> api_pb.TransactionRequest
	19, // 22: api_pb.ApiService.Transactions:input_type -> api_pb.TransactionsRequest
	20, // 23: api_pb.ApiService.UnconfirmedTxs:input_type -> api_pb.UnconfirmedTxsRequest
	21, // 24: api_pb.ApiService.Validators:input_type -> api_pb.ValidatorsRequest
	22, // 25: api_pb.ApiService.Frozen:input_type -> api_pb.FrozenRequest
	23, // 26: api_pb.ApiService.WaitList:input_type -> api_pb.WaitListRequest
	2,  // 27: api_pb.ApiService.TestBlock:input_type -> google.protobuf.Empty
	24, // 28: api_pb.ApiService.Subscribe:output_type -> api_pb.SubscribeResponse
	25, // 29: api_pb.ApiService.Halts:output_type -> api_pb.HaltsResponse
	26, // 30: api_pb.ApiService.Genesis:output_type -> api_pb.GenesisResponse
	27, // 31: api_pb.ApiService.MinGasPrice:output_type -> api_pb.MinGasPriceResponse
	28, // 32: api_pb.ApiService.NetInfo:output_type -> api_pb.NetInfoResponse
	29, // 33: api_pb.ApiService.Status:output_type -> api_pb.StatusResponse
	30, // 34: api_pb.ApiService.Address:output_type -> api_pb.AddressResponse
	31, // 35: api_pb.ApiService.Addresses:output_type -> api_pb.AddressesResponse
	32, // 36: api_pb.ApiService.Block:output_type -> api_pb.BlockResponse
	33, // 37: api_pb.ApiService.Candidate:output_type -> api_pb.CandidateResponse
	34, // 38: api_pb.ApiService.Candidates:output_type -> api_pb.CandidatesResponse
	35, // 39: api_pb.ApiService.CoinInfoById:output_type -> api_pb.CoinInfoResponse
	35, // 40: api_pb.ApiService.CoinInfo:output_type -> api_pb.CoinInfoResponse
	36, // 41: api_pb.ApiService.EstimateCoinBuy:output_type -> api_pb.EstimateCoinBuyResponse
	37, // 42: api_pb.ApiService.EstimateCoinSell:output_type -> api_pb.EstimateCoinSellResponse
	38, // 43: api_pb.ApiService.EstimateCoinSellAll:output_type -> api_pb.EstimateCoinSellAllResponse
	39, // 44: api_pb.ApiService.EstimateTxCommission:output_type -> api_pb.EstimateTxCommissionResponse
	40, // 45: api_pb.ApiService.Events:output_type -> api_pb.EventsResponse
	41, // 46: api_pb.ApiService.MaxGasPrice:output_type -> api_pb.MaxGasPriceResponse
	42, // 47: api_pb.ApiService.MissedBlocks:output_type -> api_pb.MissedBlocksResponse
	43, // 48: api_pb.ApiService.SendTransaction:output_type -> api_pb.SendTransactionResponse
	44, // 49: api_pb.ApiService.Transaction:output_type -> api_pb.TransactionResponse
	45, // 50: api_pb.ApiService.Transactions:output_type -> api_pb.TransactionsResponse
	46, // 51: api_pb.ApiService.UnconfirmedTxs:output_type -> api_pb.UnconfirmedTxsResponse
	47, // 52: api_pb.ApiService.Validators:output_type -> api_pb.ValidatorsResponse
	48, // 53: api_pb.ApiService.Frozen:output_type -> api_pb.FrozenResponse
	49, // 54: api_pb.ApiService.WaitList:output_type -> api_pb.WaitListResponse
	32, // 55: api_pb.ApiService.TestBlock:output_type -> api_pb.BlockResponse
	28, // [28:56] is the sub-list for method output_type
	0,  // [0:28] is the sub-list for method input_type
	0,  // [0:0] is the sub-list for extension type_name
	0,  // [0:0] is the sub-list for extension extendee
	0,  // [0:0] is the sub-list for field type_name
}

func init() { file_api_proto_init() }
func file_api_proto_init() {
	if File_api_proto != nil {
		return
	}
	file_resources_proto_init()
	type x struct{}
	out := protoimpl.TypeBuilder{
		File: protoimpl.DescBuilder{
			GoPackagePath: reflect.TypeOf(x{}).PkgPath(),
			RawDescriptor: file_api_proto_rawDesc,
			NumEnums:      0,
			NumMessages:   0,
			NumExtensions: 0,
			NumServices:   1,
		},
		GoTypes:           file_api_proto_goTypes,
		DependencyIndexes: file_api_proto_depIdxs,
	}.Build()
	File_api_proto = out.File
	file_api_proto_rawDesc = nil
	file_api_proto_goTypes = nil
	file_api_proto_depIdxs = nil
}
