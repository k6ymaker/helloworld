// Code generated by protoc-gen-go. DO NOT EDIT.
// source: helloworld.proto

package helloworld

/*
命名空间
*/

import proto "github.com/golang/protobuf/proto"
import fmt "fmt"
import math "math"

import (
	context "golang.org/x/net/context"
	grpc "google.golang.org/grpc"
)

// Reference imports to suppress errors if they are not otherwise used.
var _ = proto.Marshal
var _ = fmt.Errorf
var _ = math.Inf

// This is a compile-time assertion to ensure that this generated file
// is compatible with the proto package it is being compiled against.
// A compilation error at this line likely means your copy of the
// proto package needs to be updated.
const _ = proto.ProtoPackageIsVersion2 // please upgrade the proto package

type Request struct {
	Name                 string   `protobuf:"bytes,1,opt,name=name,proto3" json:"name,omitempty"`
	XXX_NoUnkeyedLiteral struct{} `json:"-"`
	XXX_unrecognized     []byte   `json:"-"`
	XXX_sizecache        int32    `json:"-"`
}

func (m *Request) Reset()         { *m = Request{} }
func (m *Request) String() string { return proto.CompactTextString(m) }
func (*Request) ProtoMessage()    {}
func (*Request) Descriptor() ([]byte, []int) {
	return fileDescriptor_helloworld_70cb297780b7aac9, []int{0}
}
func (m *Request) XXX_Unmarshal(b []byte) error {
	return xxx_messageInfo_Request.Unmarshal(m, b)
}
func (m *Request) XXX_Marshal(b []byte, deterministic bool) ([]byte, error) {
	return xxx_messageInfo_Request.Marshal(b, m, deterministic)
}
func (dst *Request) XXX_Merge(src proto.Message) {
	xxx_messageInfo_Request.Merge(dst, src)
}
func (m *Request) XXX_Size() int {
	return xxx_messageInfo_Request.Size(m)
}
func (m *Request) XXX_DiscardUnknown() {
	xxx_messageInfo_Request.DiscardUnknown(m)
}

var xxx_messageInfo_Request proto.InternalMessageInfo

func (m *Request) GetName() string {
	if m != nil {
		return m.Name
	}
	return ""
}

type Response struct {
	Code                 string   `protobuf:"bytes,5,opt,name=code,proto3" json:"code,omitempty"`
	XXX_NoUnkeyedLiteral struct{} `json:"-"`
	XXX_unrecognized     []byte   `json:"-"`
	XXX_sizecache        int32    `json:"-"`
}

func (m *Response) Reset()         { *m = Response{} }
func (m *Response) String() string { return proto.CompactTextString(m) }
func (*Response) ProtoMessage()    {}
func (*Response) Descriptor() ([]byte, []int) {
	return fileDescriptor_helloworld_70cb297780b7aac9, []int{1}
}
func (m *Response) XXX_Unmarshal(b []byte) error {
	return xxx_messageInfo_Response.Unmarshal(m, b)
}
func (m *Response) XXX_Marshal(b []byte, deterministic bool) ([]byte, error) {
	return xxx_messageInfo_Response.Marshal(b, m, deterministic)
}
func (dst *Response) XXX_Merge(src proto.Message) {
	xxx_messageInfo_Response.Merge(dst, src)
}
func (m *Response) XXX_Size() int {
	return xxx_messageInfo_Response.Size(m)
}
func (m *Response) XXX_DiscardUnknown() {
	xxx_messageInfo_Response.DiscardUnknown(m)
}

var xxx_messageInfo_Response proto.InternalMessageInfo

func (m *Response) GetCode() string {
	if m != nil {
		return m.Code
	}
	return ""
}

func init() {
	proto.RegisterType((*Request)(nil), "helloworld.Request")
	proto.RegisterType((*Response)(nil), "helloworld.Response")
}

// Reference imports to suppress errors if they are not otherwise used.
var _ context.Context
var _ grpc.ClientConn

// This is a compile-time assertion to ensure that this generated file
// is compatible with the grpc package it is being compiled against.
const _ = grpc.SupportPackageIsVersion4

// SayHiClient is the client API for SayHi service.
//
// For semantics around ctx use and closing/ending streaming RPCs, please refer to https://godoc.org/google.golang.org/grpc#ClientConn.NewStream.
type SayHiClient interface {
	Hello(ctx context.Context, in *Request, opts ...grpc.CallOption) (*Response, error)
}

type sayHiClient struct {
	cc *grpc.ClientConn
}

func NewSayHiClient(cc *grpc.ClientConn) SayHiClient {
	return &sayHiClient{cc}
}

func (c *sayHiClient) Hello(ctx context.Context, in *Request, opts ...grpc.CallOption) (*Response, error) {
	out := new(Response)
	err := c.cc.Invoke(ctx, "/helloworld.SayHi/Hello", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

// SayHiServer is the server API for SayHi service.
type SayHiServer interface {
	Hello(context.Context, *Request) (*Response, error)
}

func RegisterSayHiServer(s *grpc.Server, srv SayHiServer) {
	s.RegisterService(&_SayHi_serviceDesc, srv)
}

func _SayHi_Hello_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(Request)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(SayHiServer).Hello(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/helloworld.SayHi/Hello",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(SayHiServer).Hello(ctx, req.(*Request))
	}
	return interceptor(ctx, in, info, handler)
}

var _SayHi_serviceDesc = grpc.ServiceDesc{
	ServiceName: "helloworld.SayHi",
	HandlerType: (*SayHiServer)(nil),
	Methods: []grpc.MethodDesc{
		{
			MethodName: "Hello",
			Handler:    _SayHi_Hello_Handler,
		},
	},
	Streams:  []grpc.StreamDesc{},
	Metadata: "helloworld.proto",
}

func init() { proto.RegisterFile("helloworld.proto", fileDescriptor_helloworld_70cb297780b7aac9) }

var fileDescriptor_helloworld_70cb297780b7aac9 = []byte{
	// 134 bytes of a gzipped FileDescriptorProto
	0x1f, 0x8b, 0x08, 0x00, 0x00, 0x00, 0x00, 0x00, 0x02, 0xff, 0xe2, 0x12, 0xc8, 0x48, 0xcd, 0xc9,
	0xc9, 0x2f, 0xcf, 0x2f, 0xca, 0x49, 0xd1, 0x2b, 0x28, 0xca, 0x2f, 0xc9, 0x17, 0xe2, 0x42, 0x88,
	0x28, 0xc9, 0x72, 0xb1, 0x07, 0xa5, 0x16, 0x96, 0xa6, 0x16, 0x97, 0x08, 0x09, 0x71, 0xb1, 0xe4,
	0x25, 0xe6, 0xa6, 0x4a, 0x30, 0x2a, 0x30, 0x6a, 0x70, 0x06, 0x81, 0xd9, 0x4a, 0x72, 0x5c, 0x1c,
	0x41, 0xa9, 0xc5, 0x05, 0xf9, 0x79, 0xc5, 0xa9, 0x20, 0xf9, 0xe4, 0xfc, 0x94, 0x54, 0x09, 0x56,
	0x88, 0x3c, 0x88, 0x6d, 0x64, 0xcb, 0xc5, 0x1a, 0x9c, 0x58, 0xe9, 0x91, 0x29, 0x64, 0xc2, 0xc5,
	0xea, 0x01, 0x32, 0x55, 0x48, 0x58, 0x0f, 0xc9, 0x3e, 0xa8, 0xd1, 0x52, 0x22, 0xa8, 0x82, 0x10,
	0x03, 0x95, 0x18, 0x92, 0xd8, 0xc0, 0x0e, 0x32, 0x06, 0x04, 0x00, 0x00, 0xff, 0xff, 0x61, 0x2d,
	0x62, 0x0e, 0xa4, 0x00, 0x00, 0x00,
}
