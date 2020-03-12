/*
 Navicat Premium Data Transfer

 Source Server         : 本地postgresql
 Source Server Type    : PostgreSQL
 Source Server Version : 100011
 Source Host           : localhost:5432
 Source Catalog        : demo
 Source Schema         : public

 Target Server Type    : PostgreSQL
 Target Server Version : 100011
 File Encoding         : 65001

 Date: 17/12/2019 14:18:35
*/


-- ----------------------------
-- Sequence structure for t_baseitems_mainid_seq
-- ----------------------------
DROP SEQUENCE IF EXISTS "public"."t_baseitems_mainid_seq";
CREATE SEQUENCE "public"."t_baseitems_mainid_seq" 
INCREMENT 1
MINVALUE  1
MAXVALUE 9223372036854775807
START 1
CACHE 1;

-- ----------------------------
-- Sequence structure for t_basenavigation_mainid_seq
-- ----------------------------
DROP SEQUENCE IF EXISTS "public"."t_basenavigation_mainid_seq";
CREATE SEQUENCE "public"."t_basenavigation_mainid_seq" 
INCREMENT 1
MINVALUE  1
MAXVALUE 9223372036854775807
START 1
CACHE 1;

-- ----------------------------
-- Sequence structure for t_baseorganize_mainid_seq
-- ----------------------------
DROP SEQUENCE IF EXISTS "public"."t_baseorganize_mainid_seq";
CREATE SEQUENCE "public"."t_baseorganize_mainid_seq" 
INCREMENT 1
MINVALUE  1
MAXVALUE 9223372036854775807
START 1
CACHE 1;

-- ----------------------------
-- Table structure for base_area
-- ----------------------------
DROP TABLE IF EXISTS "public"."base_area";
CREATE TABLE "public"."base_area" (
  "id" varchar(64) COLLATE "pg_catalog"."default" NOT NULL,
  "mainid" varchar(64) COLLATE "pg_catalog"."default" NOT NULL,
  "parentid" varchar(64) COLLATE "pg_catalog"."default" NOT NULL,
  "encode" varchar(64) COLLATE "pg_catalog"."default" NOT NULL,
  "areaname" varchar(64) COLLATE "pg_catalog"."default" NOT NULL,
  "simplespelling" varchar(64) COLLATE "pg_catalog"."default" NOT NULL,
  "arealevel" int4 NOT NULL,
  "deletemark" bool NOT NULL DEFAULT false,
  "addtime" timestamp(6) NOT NULL,
  "adduserid" varchar(64) COLLATE "pg_catalog"."default" NOT NULL,
  "addusername" varchar(64) COLLATE "pg_catalog"."default" NOT NULL,
  "modifytime" timestamp(6),
  "modifyuserid" varchar(64) COLLATE "pg_catalog"."default" DEFAULT NULL::character varying,
  "modifyname" varchar(64) COLLATE "pg_catalog"."default" DEFAULT NULL::character varying,
  "deletename" varchar(64) COLLATE "pg_catalog"."default" DEFAULT NULL::character varying,
  "deletetime" timestamp(6),
  "remark" varchar(512) COLLATE "pg_catalog"."default" DEFAULT NULL::character varying,
  "sortcode" int4,
  "issys" bool NOT NULL DEFAULT false
)
;

-- ----------------------------
-- Records of base_area
-- ----------------------------
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac04e0001', '440000000000', '0', '440000000000', '广东省', 'GDS', 1, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac04e0002', '440600000000', '440000000000', '440600000000', '佛山市', 'FSS', 2, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac04e0003', '440604000000', '440600000000', '440604000000', '禅城区', 'SCQ', 3, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac04e0004', '440604010000', '440604000000', '440604010000', '石湾镇街道', 'SWZJD', 4, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac04e0005', '440604010001', '440604010000', '440604010001', '澜石社区', 'LSSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac04e0006', '440604010003', '440604010000', '440604010003', '惠景社区', 'HJSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac04e0007', '440604010004', '440604010000', '440604010004', '玫瑰社区', 'MGSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac04e0008', '440604010005', '440604010000', '440604010005', '福华社区', 'FHSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac04e0009', '440604010006', '440604010000', '440604010006', '绿景社区', 'LJSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac04e000a', '440604010007', '440604010000', '440604010007', '金子苑社区', 'JZYSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac04e000b', '440604010008', '440604010000', '440604010008', '金澜社区', 'JLSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac04e000c', '440604010009', '440604010000', '440604010009', '季华社区', 'JHSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac04e000d', '440604010010', '440604010000', '440604010010', '平远社区', 'PYSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac04e000e', '440604010011', '440604010000', '440604010011', '环湖社区', 'HHSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac04e000f', '440604010012', '440604010000', '440604010012', '丽银社区', 'LYSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac04e0010', '440604010013', '440604010000', '440604010013', '怡景社区', 'YJSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac04e0011', '440604010014', '440604010000', '440604010014', '丽豪社区', 'LHSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac04e0012', '440604010015', '440604010000', '440604010015', '湖景社区', 'HJSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac04e0013', '440604010016', '440604010000', '440604010016', '榴苑社区', 'LYSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac04e0014', '440604010017', '440604010000', '440604010017', '三友社区', 'SYSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac04e0015', '440604010018', '440604010000', '440604010018', '红卫社区', 'HWSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac04e0016', '440604010019', '440604010000', '440604010019', '忠信社区', 'ZXSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac04e0017', '440604010020', '440604010000', '440604010020', '和平社区', 'HPSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac04e0018', '440604010021', '440604010000', '440604010021', '莲峰社区', 'LFSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac04e0019', '440604010022', '440604010000', '440604010022', '劳动社区', 'LDSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac04e001a', '440604010023', '440604010000', '440604010023', '鸿翔社区', 'HXSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac04e001b', '440604010024', '440604010000', '440604010024', '文华社区', 'WHSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac04e001c', '440604010025', '440604010000', '440604010025', '东平社区', 'DPSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac04e001d', '440604010026', '440604010000', '440604010026', '江滨社区', 'JBSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac04e001e', '440604010200', '440604010000', '440604010200', '河宕村', 'HDC', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac04e001f', '440604010201', '440604010000', '440604010201', '番村', 'FC', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac04e0020', '440604010202', '440604010000', '440604010202', '塘头村', 'TTC', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac04e0021', '440604010203', '440604010000', '440604010203', '沙岗村', 'SGC', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac04e0022', '440604010204', '440604010000', '440604010204', '里水村', 'LSC', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac04e0023', '440604010205', '440604010000', '440604010205', '深村', 'SC', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac04e0024', '440604010206', '440604010000', '440604010206', '石头村', 'STC', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac04e0025', '440604010207', '440604010000', '440604010207', '石梁村', 'SLC', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac04e0026', '440604010208', '440604010000', '440604010208', '湾华村', 'WHC', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac04e0027', '440604010209', '440604010000', '440604010209', '鄱阳村', 'PYC', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac05e0028', '440604010210', '440604010000', '440604010210', '奇槎村', 'QCC', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac05e0029', '440604010211', '440604010000', '440604010211', '黎冲村', 'LCC', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac05e002a', '440604011000', '440604000000', '440604011000', '张槎街道', 'ZCJD', 4, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac05e002b', '440604011001', '440604011000', '440604011001', '纯阳社区', 'CYSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac05e002c', '440604011002', '440604011000', '440604011002', '江湾社区', 'JWSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac05e002d', '440604011003', '440604011000', '440604011003', '马岗社区', 'MGSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac05e002e', '440604011004', '440604011000', '440604011004', '清水桥社', 'QSQS', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac05e002f', '440604011006', '440604011000', '440604011006', '东便社区', 'DBSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac05e0030', '440604011008', '440604011000', '440604011008', '金沙社区', 'JSSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac05e0031', '440604011009', '440604011000', '440604011009', '智城社区', 'ZCSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac05e0032', '440604011010', '440604011000', '440604011010', '江海社区', 'JHSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac05e0033', '440604011200', '440604011000', '440604011200', '莲塘村', 'LTC', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac05e0034', '440604011201', '440604011000', '440604011201', '大富村', 'DFC', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac05e0035', '440604011202', '440604011000', '440604011202', '村头村', 'CTC', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac05e0036', '440604011203', '440604011000', '440604011203', '村尾村', 'CWC', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac05e0037', '440604011204', '440604011000', '440604011204', '上朗村', 'SLC', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac05e0038', '440604011205', '440604011000', '440604011205', '下朗村', 'XLC', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac05e0039', '440604011206', '440604011000', '440604011206', '古灶村', 'GZC', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac05e003a', '440604011207', '440604011000', '440604011207', '大江村', 'DJC', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac05e003b', '440604011208', '440604011000', '440604011208', '白坭村', 'BNC', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac05e003c', '440604011209', '440604011000', '440604011209', '张槎村', 'ZCC', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac05e003d', '440604011210', '440604011000', '440604011210', '大沙村', 'DSC', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac05e003e', '440604011211', '440604011000', '440604011211', '东鄱村', 'DPC', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac05e003f', '440604011212', '440604011000', '440604011212', '弼唐村', 'BTC', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac05e0040', '440604011213', '440604011000', '440604011213', '青柯村', 'QKC', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac05e0041', '440604011214', '440604011000', '440604011214', '海口村', 'HKC', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac05e0042', '440604012000', '440604000000', '440604012000', '祖庙街道', 'ZMJD', 4, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac05e0043', '440604012001', '440604012000', '440604012001', '朝安东社区', 'CADSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac05e0044', '440604012002', '440604012000', '440604012002', '佛平北社区', 'FPBSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac05e0045', '440604012005', '440604012000', '440604012005', '东城社区', 'DCSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac05e0046', '440604012006', '440604012000', '440604012006', '城北社区', 'CBSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac05e0047', '440604012007', '440604012000', '440604012007', '升平社区', 'SPSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac05e0048', '440604012008', '440604012000', '440604012008', '高基社区', 'GJSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac05e0049', '440604012009', '440604012000', '440604012009', '文北社区', 'WBSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac05e004a', '440604012011', '440604012000', '440604012011', '庆宁社区', 'QNSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac05e004b', '440604012012', '440604012000', '440604012012', '永安社区', 'YASQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac05e004c', '440604012013', '440604012000', '440604012013', '培德社区', 'PDSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac05e004d', '440604012014', '440604012000', '440604012014', '快子社区', 'KZSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac05e004e', '440604012016', '440604012000', '440604012016', '上沙社区', 'SSSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac05e004f', '440604012017', '440604012000', '440604012017', '同安社区', 'TASQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac05e0050', '440604012018', '440604012000', '440604012018', '文南社区', 'WNSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac05e0051', '440604012020', '440604012000', '440604012020', '妈庙社区', 'MMSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac05e0052', '440604012022', '440604012000', '440604012022', '市东社区', 'SDSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac05e0053', '440604012023', '440604012000', '440604012023', '大观社区', 'DGSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac05e0054', '440604012024', '440604012000', '440604012024', '圣堂社区', 'STSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac05e0055', '440604012025', '440604012000', '440604012025', '山紫社区', 'SZSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac05e0056', '440604012027', '440604012000', '440604012027', '后街社区', 'HJSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac05e0057', '440604012028', '440604012000', '440604012028', '红棉社区', 'HMSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac05e0058', '440604012030', '440604012000', '440604012030', '花园社区', 'HYSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac05e0059', '440604012031', '440604012000', '440604012031', '白燕社区', 'BYSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac05e005a', '440604012033', '440604012000', '440604012033', '铁军社区', 'TJSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac05e005b', '440604012034', '440604012000', '440604012034', '兰桂社区', 'LGSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac05e005c', '440604012035', '440604012000', '440604012035', '建设社区', 'JSSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac05e005d', '440604012036', '440604012000', '440604012036', '沙塘社区', 'STSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac05e005e', '440604012037', '440604012000', '440604012037', '福禄社区', 'FLSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac05e005f', '440604012039', '440604012000', '440604012039', '莺岗社区', 'YGSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac05e0060', '440604012040', '440604012000', '440604012040', '东园社区', 'DYSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac05e0061', '440604012041', '440604012000', '440604012041', '钻石社区', 'ZSSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac05e0062', '440604012042', '440604012000', '440604012042', '福贤社区', 'FXSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac05e0063', '440604012043', '440604012000', '440604012043', '燎东社区', 'LDSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac05e0064', '440604012045', '440604012000', '440604012045', '塔坡社区', 'TPSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac4260065', '440604012046', '440604012000', '440604012046', '佛平社区', 'FPSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac4260066', '440604012047', '440604012000', '440604012047', '普西社区', 'PXSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac4260067', '440604012048', '440604012000', '440604012048', '普南社区', 'PNSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac4260068', '440604012049', '440604012000', '440604012049', '忠义社区', 'ZYSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac4260069', '440604012050', '440604012000', '440604012050', '北江社区', 'BJSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac426006a', '440604012051', '440604012000', '440604012051', '普东社区', 'PDSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac426006b', '440604012052', '440604012000', '440604012052', '桂园社区', 'GYSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac426006c', '440604012053', '440604012000', '440604012053', '南桂社区', 'NGSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac426006d', '440604012054', '440604012000', '440604012054', '同华社区', 'THSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac426006e', '440604012055', '440604012000', '440604012055', '同济社区', 'TJSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac426006f', '440604012056', '440604012000', '440604012056', '旭日社区', 'XRSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac4260070', '440604012057', '440604012000', '440604012057', '垂虹社区', 'CHSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac4260071', '440604012058', '440604012000', '440604012058', '体育社区', 'TYSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac4260072', '440604012059', '440604012000', '440604012059', '卫国社区', 'WGSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac4260073', '440604012060', '440604012000', '440604012060', '保安社区', 'BASQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac4260074', '440604012061', '440604012000', '440604012061', '南浦社区', 'NPSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac4260075', '440604012062', '440604012000', '440604012062', '同福社区', 'TFSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac4260076', '440604012063', '440604012000', '440604012063', '唐园社区', 'TYSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac4260077', '440604012064', '440604012000', '440604012064', '新城社区', 'XCSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac4260078', '440604012065', '440604012000', '440604012065', '同兴社区', 'TXSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac4260079', '440604012200', '440604012000', '440604012200', '永红村', 'YHC', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac426007a', '440604012201', '440604012000', '440604012201', '永新村', 'YXC', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac426007b', '440604012202', '440604012000', '440604012202', '镇安村', 'ZAC', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac426007c', '440604012203', '440604012000', '440604012203', '朝东村', 'CDC', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac426007d', '440604012204', '440604012000', '440604012204', '东升村', 'DSC', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac426007e', '440604012205', '440604012000', '440604012205', '敦厚村', 'DHC', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac426007f', '440604012206', '440604012000', '440604012206', '扶西村', 'FXC', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac4260080', '440604012207', '440604012000', '440604012207', '郊边村', 'JBC', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac4260081', '440604012208', '440604012000', '440604012208', '简村', 'JC', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac4260082', '440604100000', '440604000000', '440604100000', '南庄镇', 'NZZ', 4, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac4260083', '440604100001', '440604100000', '440604100001', '南庄社区', 'NZSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac4260084', '440604100002', '440604100000', '440604100002', '吉利社区', 'JLSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac4260085', '440604100003', '440604100000', '440604100003', '人和社区', 'RHSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac4260086', '440604100200', '440604100000', '440604100200', '罗南村', 'LNC', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac4260087', '440604100201', '440604100000', '440604100201', '南庄村', 'NZC', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac4260088', '440604100202', '440604100000', '440604100202', '紫南村', 'ZNC', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac4260089', '440604100203', '440604100000', '440604100203', '紫洞村', 'ZDC', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac426008a', '440604100204', '440604100000', '440604100204', '湖冲村', 'HCC', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac426008b', '440604100205', '440604100000', '440604100205', '东村', 'DC', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac426008c', '440604100206', '440604100000', '440604100206', '上元村', 'SYC', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac426008d', '440604100207', '440604100000', '440604100207', '溶洲村', 'RZC', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac426008e', '440604100208', '440604100000', '440604100208', '堤田村', 'DTC', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac426008f', '440604100209', '440604100000', '440604100209', '罗格村', 'LGC', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac4260090', '440604100210', '440604100000', '440604100210', '吉利村', 'JLC', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac4260091', '440604100211', '440604100000', '440604100211', '龙津村', 'LJC', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac4260092', '440604100212', '440604100000', '440604100212', '醒群村', 'XQC', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac4260093', '440604100213', '440604100000', '440604100213', '村尾村', 'CWC', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac4260094', '440604100214', '440604100000', '440604100214', '梧村', 'WC', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac4260095', '440604100215', '440604100000', '440604100215', '河滘村', 'HJC', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac4260096', '440604100216', '440604100000', '440604100216', '杏头村', 'XTC', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac4260097', '440604100217', '440604100000', '440604100217', '贺丰村', 'HFC', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac4260098', '440605000000', '440600000000', '440605000000', '南海区', 'NHQ', 3, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac4260099', '440605011000', '440605000000', '440605011000', '桂城街道', 'GCJD', 4, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac426009a', '440605011001', '440605011000', '440605011001', '桂一社区', 'GYSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac426009b', '440605011004', '440605011000', '440605011004', '叠二社区', 'DESQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac426009c', '440605011005', '440605011000', '440605011005', '花苑社区', 'HYSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac426009d', '440605011007', '440605011000', '440605011007', '桂雅社区', 'GYSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac426009e', '440605011008', '440605011000', '440605011008', '桂园社区', 'GYSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac426009f', '440605011010', '440605011000', '440605011010', '大圩社区', 'DWSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac42600a0', '440605011011', '440605011000', '440605011011', '江滨社区', 'JBSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac42600a1', '440605011015', '440605011000', '440605011015', '江南名居社会', 'JNMJSH', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac42600a2', '440605011016', '440605011000', '440605011016', '翠颐社区', 'CYSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac42600a3', '440605011020', '440605011000', '440605011020', '灯湖社区', 'DHSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac42600a4', '440605011025', '440605011000', '440605011025', '东二社区', 'DESQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac42600a5', '440605011026', '440605011000', '440605011026', '石肯社区', 'SKSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac42600a6', '440605011027', '440605011000', '440605011027', '叠南社区', 'DNSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac42600a7', '440605011028', '440605011000', '440605011028', '叠北社区', 'DBSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac42600a8', '440605011029', '440605011000', '440605011029', '平东社区', 'PDSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac42600a9', '440605011030', '440605011000', '440605011030', '平南社区', 'PNSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac42600aa', '440605011031', '440605011000', '440605011031', '平西社区', 'PXSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac42600ab', '440605011032', '440605011000', '440605011032', '平北社区', 'PBSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac42600ac', '440605011033', '440605011000', '440605011033', '平胜社区', 'PSSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac42600ad', '440605011034', '440605011000', '440605011034', '夏东社区', 'XDSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac42600ae', '440605011037', '440605011000', '440605011037', '夏北社区', 'XBSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac42600af', '440605011038', '440605011000', '440605011038', '中区社区', 'ZQSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac43500b0', '440605011039', '440605011000', '440605011039', '东区社区', 'DQSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac43500b1', '440605011041', '440605011000', '440605011041', '林岳社区', 'LYSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac43500b2', '440605011042', '440605011000', '440605011042', '雷岗社区', 'LGSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac43500b3', '440605011043', '440605011000', '440605011043', '大德社区', 'DDSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac43500b4', '440605011044', '440605011000', '440605011044', '凤鸣社区', 'FMSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac43500b5', '440605011045', '440605011000', '440605011045', '夏南社区', 'XNSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac43500b6', '440605011046', '440605011000', '440605011046', '桂花社区', 'GHSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac43500b7', '440605011047', '440605011000', '440605011047', '桂南社区', 'GNSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac43500b8', '440605011048', '440605011000', '440605011048', '怡海社区', 'YHSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac43500b9', '440605011217', '440605011000', '440605011217', '夏西村', 'XXC', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac43500ba', '440605121000', '440605000000', '440605121000', '九江镇', 'JJZ', 4, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac43500bb', '440605121001', '440605121000', '440605121001', '江滨社区', 'JBSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac43500bc', '440605121003', '440605121000', '440605121003', '儒林社区', 'RLSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac43500bd', '440605121004', '440605121000', '440605121004', '沙口社区', 'SKSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac43500be', '440605121006', '440605121000', '440605121006', '水南社区', 'SNSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac43500bf', '440605121007', '440605121000', '440605121007', '下西社区', 'XXSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac43500c0', '440605121008', '440605121000', '440605121008', '南方社区', 'NFSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac43500c1', '440605121010', '440605121000', '440605121010', '朗星社区', 'LXSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac43500c2', '440605121011', '440605121000', '440605121011', '沙咀社区', 'SJSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac43500c3', '440605121012', '440605121000', '440605121012', '敦根社区', 'DGSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac43500c4', '440605121013', '440605121000', '440605121013', '梅圳社区', 'MZSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac43500c5', '440605121014', '440605121000', '440605121014', '大谷社区', 'DGSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac43500c6', '440605121015', '440605121000', '440605121015', '河清社区', 'HQSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac43500c7', '440605121016', '440605121000', '440605121016', '下北社区', 'XBSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac43500c8', '440605121017', '440605121000', '440605121017', '上东社区', 'SDSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac4a300c9', '440605121018', '440605121000', '440605121018', '英明社区', 'YMSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac4a300ca', '440605121019', '440605121000', '440605121019', '沙头社区', 'STSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac4a300cb', '440605121035', '440605121000', '440605121035', '璜矶社区', 'HJSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac4a300cc', '440605121037', '440605121000', '440605121037', '石江社区', 'SJSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac4a300cd', '440605121041', '440605121000', '440605121041', '北村社区', 'BCSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac4a300ce', '440605121201', '440605121000', '440605121201', '新龙村', 'XLC', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac4a300cf', '440605121206', '440605121000', '440605121206', '上西村', 'SXC', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac4a300d0', '440605121208', '440605121000', '440605121208', '海寿村', 'HSC', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac4a300d1', '440605121211', '440605121000', '440605121211', '下东村', 'XDC', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac4a300d2', '440605121214', '440605121000', '440605121214', '烟南村', 'YNC', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac4a300d3', '440605121216', '440605121000', '440605121216', '镇南村', 'ZNC', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac4a300d4', '440605121222', '440605121000', '440605121222', '南金村', 'NJC', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac4a300d5', '440605122000', '440605000000', '440605122000', '西樵镇', 'XQZ', 4, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac4a300d6', '440605122001', '440605122000', '440605122001', '东碧社区', 'DBSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac4a300d7', '440605122002', '440605122000', '440605122002', '樵华社区', 'QHSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac4a300d8', '440605122003', '440605122000', '440605122003', '樵园社区', 'QYSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac4a300d9', '440605122005', '440605122000', '440605122005', '樵乐社区', 'QLSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac4a300da', '440605122006', '440605122000', '440605122006', '西樵社区', 'XQSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac4a300db', '440605122007', '440605122000', '440605122007', '联新社区', 'LXSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac4a300dc', '440605122008', '440605122000', '440605122008', '山根社区', 'SGSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac4a300dd', '440605122010', '440605122000', '440605122010', '西岸社区', 'XASQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac4a300de', '440605122011', '440605122000', '440605122011', '显岗社区', 'XGSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac4a300df', '440605122012', '440605122000', '440605122012', '民乐社区', 'MLSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac4a300e0', '440605122013', '440605122000', '440605122013', '百西社区', 'BXSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac4a300e1', '440605122015', '440605122000', '440605122015', '崇南社区', 'CNSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac4a300e2', '440605122016', '440605122000', '440605122016', '太平社区', 'TPSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac4a300e3', '440605122030', '440605122000', '440605122030', '上金瓯社区', 'SJOSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac4a300e4', '440605122033', '440605122000', '440605122033', '崇北社区', 'CBSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac4a300e5', '440605122035', '440605122000', '440605122035', '河岗社区', 'HGSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac4a300e6', '440605122037', '440605122000', '440605122037', '新河社区', 'XHSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac4a300e7', '440605122041', '440605122000', '440605122041', '稔岗社区', 'RGSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac4a300e8', '440605122043', '440605122000', '440605122043', '朝山社区', 'CSSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac4a300e9', '440605122045', '440605122000', '440605122045', '大同社区', 'DTSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac4a300ea', '440605122046', '440605122000', '440605122046', '听音湖社区', 'TYHSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac4a300eb', '440605122201', '440605122000', '440605122201', '岭西村', 'LXC', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac4a300ec', '440605122206', '440605122000', '440605122206', '儒溪村', 'RXC', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac4a300ed', '440605122208', '440605122000', '440605122208', '百东村', 'BDC', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac4a300ee', '440605122211', '440605122000', '440605122211', '华夏村', 'HXC', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac4a300ef', '440605122212', '440605122000', '440605122212', '大岸村', 'DAC', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac4a300f0', '440605122218', '440605122000', '440605122218', '平沙村', 'PSC', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac4a300f1', '440605122219', '440605122000', '440605122219', '海舟村', 'HZC', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac4a300f2', '440605122220', '440605122000', '440605122220', '新田村', 'XTC', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac4a300f3', '440605122224', '440605122000', '440605122224', '七星村', 'QXC', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac4a300f4', '440605123000', '440605000000', '440605123000', '丹灶镇', 'DZZ', 4, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac4a300f5', '440605123001', '440605123000', '440605123001', '丹灶社区', 'DZSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac4a300f6', '440605123005', '440605123000', '440605123005', '南沙社区', 'NSSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac4a300f7', '440605123007', '440605123000', '440605123007', '石联社区', 'SLSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac4a300f8', '440605123008', '440605123000', '440605123008', '联沙社区', 'LSSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac4a300f9', '440605123009', '440605123000', '440605123009', '上安社区', 'SASQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac4a300fa', '440605123016', '440605123000', '440605123016', '仙岗社区', 'XGSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac4a300fb', '440605123017', '440605123000', '440605123017', '西城社区', 'XCSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac4a300fc', '440605123018', '440605123000', '440605123018', '银河社区', 'YHSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac4a300fd', '440605123019', '440605123000', '440605123019', '东升社区', 'DSSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac4a300fe', '440605123020', '440605123000', '440605123020', '劳边社区', 'LBSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac4a300ff', '440605123021', '440605123000', '440605123021', '下沙滘社区', 'XSJSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac4a30100', '440605123022', '440605123000', '440605123022', '云溪社区', 'YXSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac4a30101', '440605123023', '440605123000', '440605123023', '金宁社区', 'JNSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac4a30102', '440605123024', '440605123000', '440605123024', '建设社区', 'JSSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac4a30103', '440605123026', '440605123000', '440605123026', '沙滘社区', 'SJSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac4a30104', '440605123028', '440605123000', '440605123028', '罗行社区', 'LXSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac4a30105', '440605123038', '440605123000', '440605123038', '东联社区', 'DLSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac4a30106', '440605123039', '440605123000', '440605123039', '西联社区', 'XLSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac4a30107', '440605123211', '440605123000', '440605123211', '良登村', 'LDC', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac4a30108', '440605123212', '440605123000', '440605123212', '朗心村', 'LXC', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac4a30109', '440605123224', '440605123000', '440605123224', '下滘村', 'XJC', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac4a3010a', '440605123225', '440605123000', '440605123225', '中安村', 'ZAC', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac4a3010b', '440605123226', '440605123000', '440605123226', '西岸村', 'XAC', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac4a3010c', '440605123227', '440605123000', '440605123227', '下安村', 'XAC', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac4a3010d', '440605124000', '440605000000', '440605124000', '狮山镇', 'SSZ', 4, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac4a3010e', '440605124001', '440605124000', '440605124001', '狮城社区', 'SCSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac4a3010f', '440605124004', '440605124000', '440605124004', '塘中社区', 'TZSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac4a30110', '440605124007', '440605124000', '440605124007', '松岗社区', 'SGSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac4a30111', '440605124013', '440605124000', '440605124013', '联表社区', 'LBSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac4a30112', '440605124014', '440605124000', '440605124014', '山南社区', 'SNSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac4a30113', '440605124015', '440605124000', '440605124015', '石碣社区', 'SJSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac4a30114', '440605124017', '440605124000', '440605124017', '小塘社区', 'XTSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac4a30115', '440605124027', '440605124000', '440605124027', '华涌社区', 'HYSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac4a30116', '440605124029', '440605124000', '440605124029', '穆园社区', 'MYSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac4a30117', '440605124030', '440605124000', '440605124030', '塘头社区', 'TTSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac4a30118', '440605124031', '440605124000', '440605124031', '白沙桥社区', 'BSQSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac4a30119', '440605124032', '440605124000', '440605124032', '招大社区', 'ZDSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac4a3011a', '440605124038', '440605124000', '440605124038', '洞边社区', 'DBSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac4a3011b', '440605124041', '440605124000', '440605124041', '五星社区', 'WXSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac4a3011c', '440605124045', '440605124000', '440605124045', '群岗社区', 'QGSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac4a3011d', '440605124050', '440605124000', '440605124050', '永安社区', 'YASQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac4a3011e', '440605124053', '440605124000', '440605124053', '大榄社区', 'DLSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac4a3011f', '440605124055', '440605124000', '440605124055', '红星社区', 'HXSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac4a30120', '440605124056', '440605124000', '440605124056', '丁圃社区', 'DPSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac4a30121', '440605124057', '440605124000', '440605124057', '沙头社区', 'STSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac4a30122', '440605124060', '440605124000', '440605124060', '高边社区', 'GBSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac4a30123', '440605124061', '440605124000', '440605124061', '兴贤社区', 'XXSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac4a30124', '440605124062', '440605124000', '440605124062', '颜峰社区', 'YFSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac4a30125', '440605124063', '440605124000', '440605124063', '谭边社区', 'TBSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac4a30126', '440605124064', '440605124000', '440605124064', '横岗社区', 'HGSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac4a30127', '440605124065', '440605124000', '440605124065', '罗湖社区', 'LHSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac4a30128', '440605124068', '440605124000', '440605124068', '联和社区', 'LHSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac4a30129', '440605124069', '440605124000', '440605124069', '街边社区', 'JBSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac4a3012a', '440605124070', '440605124000', '440605124070', '沙坑社区', 'SKSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac4a3012b', '440605124071', '440605124000', '440605124071', '上柏社区', 'SBSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac4a3012c', '440605124072', '440605124000', '440605124072', '下柏社区', 'XBSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac510012d', '440605124073', '440605124000', '440605124073', '罗村社区', 'LCSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac510012e', '440605124074', '440605124000', '440605124074', '务庄社区', 'WZSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac510012f', '440605124075', '440605124000', '440605124075', '朗沙社区', 'LSSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac5100130', '440605124076', '440605124000', '440605124076', '芦塘社区', 'LTSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac5100131', '440605124080', '440605124000', '440605124080', '显纲社区', 'XGSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac5100132', '440605124090', '440605124000', '440605124090', '联星社区', 'LXSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac5100133', '440605124091', '440605124000', '440605124091', '官窑社区', 'GYSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac5100134', '440605124201', '440605124000', '440605124201', '唐边村', 'TBC', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac5100135', '440605124202', '440605124000', '440605124202', '黄洞村', 'HDC', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac51f0136', '440605124203', '440605124000', '440605124203', '狮中村', 'SZC', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac51f0137', '440605124204', '440605124000', '440605124204', '狮北村', 'SBC', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac51f0138', '440605124205', '440605124000', '440605124205', '罗洞村', 'LDC', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac51f0139', '440605124206', '440605124000', '440605124206', '塱下村', 'LXC', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac51f013a', '440605124208', '440605124000', '440605124208', '大涡塘村', 'DWTC', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac51f013b', '440605124213', '440605124000', '440605124213', '狮西村', 'SXC', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac51f013c', '440605124214', '440605124000', '440605124214', '狮岭村', 'SLC', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac51f013d', '440605124215', '440605124000', '440605124215', '狮南村', 'SNC', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac51f013e', '440605124216', '440605124000', '440605124216', '莲子塘村', 'LZTC', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac51f013f', '440605124219', '440605124000', '440605124219', '莲塘村', 'LTC', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac51f0140', '440605124220', '440605124000', '440605124220', '新境村', 'XJC', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac51f0141', '440605124226', '440605124000', '440605124226', '象岭村', 'XLC', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac51f0142', '440605124227', '440605124000', '440605124227', '南浦村', 'NPC', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac51f0143', '440605124228', '440605124000', '440605124228', '石澎村', 'SPC', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac51f0144', '440605124229', '440605124000', '440605124229', '黎岗村', 'LGC', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac51f0145', '440605124231', '440605124000', '440605124231', '吴屋村', 'WWC', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac51f0146', '440605124232', '440605124000', '440605124232', '永和村', 'YHC', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac51f0147', '440605124234', '440605124000', '440605124234', '刘边村', 'LBC', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac51f0148', '440605124238', '440605124000', '440605124238', '新和村', 'XHC', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac51f0149', '440605124239', '440605124000', '440605124239', '凤岗村', 'FGC', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac51f014a', '440605124244', '440605124000', '440605124244', '塘联村', 'TLC', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac51f014b', '440605124245', '440605124000', '440605124245', '万石村', 'WSC', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac51f014c', '440605124246', '440605124000', '440605124246', '显子岗村', 'XZGC', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac51f014d', '440605124247', '440605124000', '440605124247', '龙头村', 'LTC', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac51f014e', '440605124248', '440605124000', '440605124248', '沙水村', 'SSC', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac51f014f', '440605124249', '440605124000', '440605124249', '石泉村', 'SQC', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac51f0150', '440605125000', '440605000000', '440605125000', '大沥镇', 'DLZ', 4, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac51f0151', '440605125001', '440605125000', '440605125001', '沥苑社区', 'LYSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac51f0152', '440605125002', '440605125000', '440605125002', '沥南社区', 'LNSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac51f0153', '440605125003', '440605125000', '440605125003', '沥雄社区', 'LXSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac51f0154', '440605125004', '440605125000', '440605125004', '沥兴社区', 'LXSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac51f0155', '440605125005', '440605125000', '440605125005', '直街社区', 'ZJSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac51f0156', '440605125006', '440605125000', '440605125006', '六村社区', 'LCSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac51f0157', '440605125007', '440605125000', '440605125007', '华夏社区', 'HXSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac51f0158', '440605125008', '440605125000', '440605125008', '岐阳社区', 'QYSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac51f0159', '440605125010', '440605125000', '440605125010', '嘉怡社区', 'JYSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac51f015a', '440605125011', '440605125000', '440605125011', '洞庭社区', 'DTSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac51f015b', '440605125012', '440605125000', '440605125012', '江北社区', 'JBSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac51f015c', '440605125016', '440605125000', '440605125016', '沥北社区', 'LBSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac51f015d', '440605125017', '440605125000', '440605125017', '沥东社区', 'LDSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac51f015e', '440605125018', '440605125000', '440605125018', '沥西社区', 'LXSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac51f015f', '440605125019', '440605125000', '440605125019', '沥中社区', 'LZSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac51f0160', '440605125020', '440605125000', '440605125020', '雅瑶社区', 'YYSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac51f0161', '440605125021', '440605125000', '440605125021', '联滘社区', 'LJSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac51f0162', '440605125022', '440605125000', '440605125022', '凤池社区', 'FCSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac51f0163', '440605125023', '440605125000', '440605125023', '水头社区', 'STSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac51f0164', '440605125024', '440605125000', '440605125024', '奇槎社区', 'QCSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac51f0165', '440605125025', '440605125000', '440605125025', '钟边社区', 'ZBSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac51f0166', '440605125026', '440605125000', '440605125026', '大镇社区', 'DZSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac51f0167', '440605125027', '440605125000', '440605125027', '谢边社区', 'XBSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac51f0168', '440605125028', '440605125000', '440605125028', '曹边社区', 'CBSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac51f0169', '440605125029', '440605125000', '440605125029', '太平社区', 'TPSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac51f016a', '440605125035', '440605125000', '440605125035', '黄岐社区', 'HQSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac51f016b', '440605125036', '440605125000', '440605125036', '六联社区', 'LLSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac51f016c', '440605125038', '440605125000', '440605125038', '泌冲社区', 'MCSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac51f016d', '440605125039', '440605125000', '440605125039', '白沙社区', 'BSSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac51f016e', '440605125040', '440605125000', '440605125040', '沙溪社区', 'SXSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac51f016f', '440605125041', '440605125000', '440605125041', '盐步社区', 'YBSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac51f0170', '440605125042', '440605125000', '440605125042', '河东社区', 'HDSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac51f0171', '440605125043', '440605125000', '440605125043', '河西社区', 'HXSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac51f0172', '440605125044', '440605125000', '440605125044', '联安社区', 'LASQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac51f0173', '440605125045', '440605125000', '440605125045', '平地社区', 'PDSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac51f0174', '440605125046', '440605125000', '440605125046', '横江社区', 'HJSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac51f0175', '440605125047', '440605125000', '440605125047', '东秀社区', 'DXSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac51f0176', '440605125048', '440605125000', '440605125048', '岐丰社区', 'QFSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac51f0177', '440605126000', '440605000000', '440605126000', '里水镇', 'LSZ', 4, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac51f0178', '440605126004', '440605126000', '440605126004', '沙涌社区', 'SYSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac51f0179', '440605126005', '440605126000', '440605126005', '草场社区', 'CCSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac51f017a', '440605126006', '440605126000', '440605126006', '河村社区', 'HCSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac51f017b', '440605126007', '440605126000', '440605126007', '甘蕉社区', 'GJSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac51f017c', '440605126008', '440605126000', '440605126008', '胜利社区', 'SLSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac51f017d', '440605126009', '440605126000', '440605126009', '大步社区', 'DBSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac51f017e', '440605126010', '440605126000', '440605126010', '洲村社区', 'ZCSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac51f017f', '440605126011', '440605126000', '440605126011', '大冲社区', 'DCSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac51f0180', '440605126012', '440605126000', '440605126012', '大石社区', 'DSSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac51f0181', '440605126014', '440605126000', '440605126014', '邓岗社区', 'DGSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac51f0182', '440605126015', '440605126000', '440605126015', '和顺社区', 'HSSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac51f0183', '440605126017', '440605126000', '440605126017', '里水社区', 'LSSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac51f0184', '440605126018', '440605126000', '440605126018', '金溪社区', 'JXSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac51f0185', '440605126023', '440605126000', '440605126023', '流潮社区', 'LCSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac51f0186', '440605126044', '440605126000', '440605126044', '共同社区', 'GTSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac51f0187', '440605126045', '440605126000', '440605126045', '白岗社区', 'BGSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac51f0188', '440605126046', '440605126000', '440605126046', '文教社区', 'WJSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac51f0189', '440605126209', '440605126000', '440605126209', '得胜村', 'DSC', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac51f018a', '440605126210', '440605126000', '440605126210', '宏岗村', 'HGC', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac51f018b', '440605126211', '440605126000', '440605126211', '赤山村', 'CSC', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac51f018c', '440605126212', '440605126000', '440605126212', '麻奢村', 'MSC', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac51f018d', '440605126213', '440605126000', '440605126213', '布新村', 'BXC', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac51f018e', '440605126214', '440605126000', '440605126214', '岗联村', 'GLC', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac51f018f', '440605126216', '440605126000', '440605126216', '北沙村', 'BSC', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac51f0190', '440605126221', '440605126000', '440605126221', '瑶头村', 'YTC', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac58d0191', '440605126222', '440605126000', '440605126222', '鹤峰村', 'HFC', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac58d0192', '440605126227', '440605126000', '440605126227', '贤僚村', 'XLC', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac58d0193', '440605126228', '440605126000', '440605126228', '鲁岗村', 'LGC', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac58d0194', '440605126229', '440605126000', '440605126229', '汤村', 'TC', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac58d0195', '440605126230', '440605126000', '440605126230', '小布村', 'XBC', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac58d0196', '440605126232', '440605126000', '440605126232', '建星村', 'JXC', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac58d0197', '440605126233', '440605126000', '440605126233', '逢涌村', 'FYC', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac58d0198', '440605126234', '440605126000', '440605126234', '石塘村', 'STC', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac58d0199', '440606000000', '440600000000', '440606000000', '顺德区', 'SDQ', 3, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac58d019a', '440606003000', '440606000000', '440606003000', '伦教街道', 'LJJD', 4, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac58d019b', '440606003001', '440606003000', '440606003001', '常教社区', 'CJSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac58d019c', '440606003002', '440606003000', '440606003002', '三洲社区', 'SZSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac58d019d', '440606003201', '440606003000', '440606003201', '永丰村', 'YFC', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac58d019e', '440606003202', '440606003000', '440606003202', '鸡洲村', 'JZC', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac58d019f', '440606003203', '440606003000', '440606003203', '霞石村', 'XSC', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac58d01a0', '440606003204', '440606003000', '440606003204', '熹涌村', 'XYC', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac58d01a1', '440606003205', '440606003000', '440606003205', '荔村', 'LC', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac58d01a2', '440606003208', '440606003000', '440606003208', '羊额村', 'YEC', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac58d01a3', '440606003209', '440606003000', '440606003209', '新塘村', 'XTC', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac58d01a4', '440606003210', '440606003000', '440606003210', '仕版村', 'SBC', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac58d01a5', '440606004000', '440606000000', '440606004000', '勒流街道', 'LLJD', 4, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac58d01a6', '440606004001', '440606004000', '440606004001', '勒流社区', 'LLSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac58d01a7', '440606004002', '440606004000', '440606004002', '黄连社区', 'HLSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac58d01a8', '440606004003', '440606004000', '440606004003', '光大社区', 'GDSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac58d01a9', '440606004004', '440606004000', '440606004004', '大晚社区', 'DWSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac58d01aa', '440606004005', '440606004000', '440606004005', '新城社区', 'XCSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac58d01ab', '440606004203', '440606004000', '440606004203', '勒北村', 'LBC', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac58d01ac', '440606004204', '440606004000', '440606004204', '东风村', 'DFC', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac58d01ad', '440606004207', '440606004000', '440606004207', '新明村', 'XMC', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac58d01ae', '440606004208', '440606004000', '440606004208', '江义村', 'JYC', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac58d01af', '440606004209', '440606004000', '440606004209', '扶闾村', 'FLC', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac58d01b0', '440606004210', '440606004000', '440606004210', '稔海村', 'RHC', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac58d01b1', '440606004211', '440606004000', '440606004211', '上涌村', 'SYC', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac58d01b2', '440606004212', '440606004000', '440606004212', '江村', 'JC', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac58d01b3', '440606004213', '440606004000', '440606004213', '南水村', 'NSC', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac58d01b4', '440606004214', '440606004000', '440606004214', '众涌村', 'ZYC', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac58d01b5', '440606004215', '440606004000', '440606004215', '龙眼村', 'LYC', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac58d01b6', '440606004216', '440606004000', '440606004216', '西华村', 'XHC', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac58d01b7', '440606004217', '440606004000', '440606004217', '富裕村', 'FYC', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac58d01b8', '440606004218', '440606004000', '440606004218', '连杜村', 'LDC', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac58d01b9', '440606004220', '440606004000', '440606004220', '新安村', 'XAC', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac58d01ba', '440606004221', '440606004000', '440606004221', '裕源村', 'YYC', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac58d01bb', '440606004222', '440606004000', '440606004222', '冲鹤村', 'CHC', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac58d01bc', '440606005000', '440606000000', '440606005000', '大良街道', 'DLJD', 4, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac58d01bd', '440606005001', '440606005000', '440606005001', '升平社区', 'SPSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac58d01be', '440606005002', '440606005000', '440606005002', '文秀社区', 'WXSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac58d01bf', '440606005003', '440606005000', '440606005003', '金榜社区', 'JBSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac58d01c0', '440606005004', '440606005000', '440606005004', '中区社区', 'ZQSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac58d01c1', '440606005005', '440606005000', '440606005005', '北区社区', 'BQSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac58d01c2', '440606005006', '440606005000', '440606005006', '府又社区', 'FYSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac58d01c3', '440606005007', '440606005000', '440606005007', '新桂社区', 'XGSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac58d01c4', '440606005008', '440606005000', '440606005008', '南华社区', 'NHSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac58d01c5', '440606005009', '440606005000', '440606005009', '顺峰社区', 'SFSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac58d01c6', '440606005010', '440606005000', '440606005010', '云路社区', 'YLSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac58d01c7', '440606005011', '440606005000', '440606005011', '红岗社区', 'HGSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac58d01c8', '440606005012', '440606005000', '440606005012', '大门社区', 'DMSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac58d01c9', '440606005013', '440606005000', '440606005013', '新松社区', 'XSSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac58d01ca', '440606005014', '440606005000', '440606005014', '新滘社区', 'XJSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac58d01cb', '440606005015', '440606005000', '440606005015', '近良社区', 'JLSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac58d01cc', '440606005016', '440606005000', '440606005016', '南江社区', 'NJSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac58d01cd', '440606005017', '440606005000', '440606005017', '苏岗社区', 'SGSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac58d01ce', '440606005018', '440606005000', '440606005018', '五沙社区', 'WSSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac58d01cf', '440606005019', '440606005000', '440606005019', '德和社区', 'DHSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac58d01d0', '440606005204', '440606005000', '440606005204', '古鉴村', 'GJC', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac58d01d1', '440606005211', '440606005000', '440606005211', '逢沙村', 'FSC', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac58d01d2', '440606006000', '440606000000', '440606006000', '容桂街道', 'RGJD', 4, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac58d01d3', '440606006001', '440606006000', '440606006001', '桂洲社区', 'GZSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac58d01d4', '440606006002', '440606006000', '440606006002', '上佳市社区', 'SJSSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac58d01d5', '440606006003', '440606006000', '440606006003', '容山社区', 'RSSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac58d01d6', '440606006004', '440606006000', '440606006004', '振华社区', 'ZHSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac58d01d7', '440606006005', '440606006000', '440606006005', '卫红社区', 'WHSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac58d01d8', '440606006006', '440606006000', '440606006006', '东风社区', 'DFSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac58d01d9', '440606006007', '440606006000', '440606006007', '朝阳社区', 'CYSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac58d01da', '440606006008', '440606006000', '440606006008', '容新社区', 'RXSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac58d01db', '440606006009', '440606006000', '440606006009', '德胜社区', 'DSSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac58d01dc', '440606006010', '440606006000', '440606006010', '细滘社区', 'XJSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac58d01dd', '440606006011', '440606006000', '440606006011', '红星社区', 'HXSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac58d01de', '440606006012', '440606006000', '440606006012', '幸福社区', 'XFSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac58d01df', '440606006013', '440606006000', '440606006013', '红旗社区', 'HQSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac58d01e0', '440606006014', '440606006000', '440606006014', '四基社区', 'SJSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac58d01e1', '440606006015', '440606006000', '440606006015', '大福基社区', 'DFJSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac58d01e2', '440606006016', '440606006000', '440606006016', '海尾社区', 'HWSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac58d01e3', '440606006017', '440606006000', '440606006017', '南区社区', 'NQSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac58d01e4', '440606006018', '440606006000', '440606006018', '容里社区', 'RLSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac58d01e5', '440606006019', '440606006000', '440606006019', '小黄圃社区', 'XHPSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac58d01e6', '440606006020', '440606006000', '440606006020', '容边社区', 'RBSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac58d01e7', '440606006021', '440606006000', '440606006021', '扁滘社区', 'BJSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac58d01e8', '440606006022', '440606006000', '440606006022', '华口社区', 'HKSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac58d01e9', '440606006023', '440606006000', '440606006023', '高黎社区', 'GLSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac58d01ea', '440606006201', '440606006000', '440606006201', '穗香村', 'SXC', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac58d01eb', '440606006202', '440606006000', '440606006202', '龙涌口村', 'LYKC', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac58d01ec', '440606006203', '440606006000', '440606006203', '马冈村', 'MGC', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac58d01ed', '440606101000', '440606000000', '440606101000', '陈村镇', 'CCZ', 4, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac58d01ee', '440606101001', '440606101000', '440606101001', '旧圩社区', 'JWSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac58d01ef', '440606101002', '440606101000', '440606101002', '勒竹社区', 'LZSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac58d01f0', '440606101003', '440606101000', '440606101003', '赤花社区', 'CHSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac58d01f1', '440606101004', '440606101000', '440606101004', '锦龙社区', 'JLSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac58d01f2', '440606101005', '440606101000', '440606101005', '南涌社区', 'NYSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac58d01f3', '440606101006', '440606101000', '440606101006', '合成社区', 'HCSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac58d01f4', '440606101007', '440606101000', '440606101007', '永兴社区', 'YXSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac5fc01f5', '440606101008', '440606101000', '440606101008', '花城社区', 'HCSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac5fc01f6', '440606101207', '440606101000', '440606101207', '弼教村', 'BJC', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac5fc01f7', '440606101208', '440606101000', '440606101208', '石洲村', 'SZC', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac5fc01f8', '440606101209', '440606101000', '440606101209', '仙涌村', 'XYC', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac5fc01f9', '440606101210', '440606101000', '440606101210', '庄头村', 'ZTC', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac5fc01fa', '440606101211', '440606101000', '440606101211', '绀现村', 'GXC', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac5fc01fb', '440606101212', '440606101000', '440606101212', '潭州村', 'TZC', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac5fc01fc', '440606101213', '440606101000', '440606101213', '大都村', 'DDC', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac5fc01fd', '440606102000', '440606000000', '440606102000', '北滘镇', 'BJZ', 4, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac5fc01fe', '440606102001', '440606102000', '440606102001', '北滘社区', 'BJSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac5fc01ff', '440606102002', '440606102000', '440606102002', '碧江社区', 'BJSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac5fc0200', '440606102003', '440606102000', '440606102003', '林头社区', 'LTSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac5fc0201', '440606102004', '440606102000', '440606102004', '广教社区', 'GJSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac5fc0202', '440606102005', '440606102000', '440606102005', '三洪奇社区', 'SHQSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac5fc0203', '440606102006', '440606102000', '440606102006', '槎涌社区', 'CYSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac5fc0204', '440606102007', '440606102000', '440606102007', '碧桂园社区', 'BGYSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac5fc0205', '440606102008', '440606102000', '440606102008', '顺江社区', 'SJSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac5fc0206', '440606102009', '440606102000', '440606102009', '君兰社区', 'JLSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac5fc0207', '440606102010', '440606102000', '440606102010', '设计城社区', 'SJCSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac5fc0208', '440606102201', '440606102000', '440606102201', '黄龙村', 'HLC', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac5fc0209', '440606102207', '440606102000', '440606102207', '莘村', 'XC', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac5fc020a', '440606102208', '440606102000', '440606102208', '水口村', 'SKC', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac5fc020b', '440606102209', '440606102000', '440606102209', '马龙村', 'MLC', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac5fc020c', '440606102211', '440606102000', '440606102211', '上僚村', 'SLC', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac5fc020d', '440606102212', '440606102000', '440606102212', '西滘村', 'XJC', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac5fc020e', '440606102213', '440606102000', '440606102213', '高村', 'GC', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac5fc020f', '440606102215', '440606102000', '440606102215', '桃村', 'TC', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac5fc0210', '440606102216', '440606102000', '440606102216', '西海村', 'XHC', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac5fc0211', '440606102218', '440606102000', '440606102218', '三桂村', 'SGC', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac5fc0212', '440606103000', '440606000000', '440606103000', '乐从镇', 'LCZ', 4, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac5fc0213', '440606103001', '440606103000', '440606103001', '乐从社区', 'LCSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac60b0214', '440606103002', '440606103000', '440606103002', '沙滘社区', 'SJSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac60b0215', '440606103003', '440606103000', '440606103003', '平步社区', 'PBSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac60b0216', '440606103004', '440606103000', '440606103004', '腾冲社区', 'TCSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac60b0217', '440606103005', '440606103000', '440606103005', '兴乐社区', 'XLSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac60b0218', '440606103201', '440606103000', '440606103201', '新隆村', 'XLC', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac60b0219', '440606103202', '440606103000', '440606103202', '葛岸村', 'GAC', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac60b021a', '440606103203', '440606103000', '440606103203', '良教村', 'LJC', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac60b021b', '440606103204', '440606103000', '440606103204', '上华村', 'SHC', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac60b021c', '440606103205', '440606103000', '440606103205', '小布村', 'XBC', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac60b021d', '440606103206', '440606103000', '440606103206', '荷村', 'HC', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac60b021e', '440606103207', '440606103000', '440606103207', '大墩村', 'DDC', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac60b021f', '440606103208', '440606103000', '440606103208', '小涌村', 'XYC', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac60b0220', '440606103209', '440606103000', '440606103209', '岳步村', 'YBC', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac60b0221', '440606103210', '440606103000', '440606103210', '良村', 'LC', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac60b0222', '440606103211', '440606103000', '440606103211', '劳村', 'LC', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac60b0223', '440606103212', '440606103000', '440606103212', '劳村', 'LC', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac60b0224', '440606103213', '440606103000', '440606103213', '大罗村', 'DLC', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac60b0225', '440606103214', '440606103000', '440606103214', '路州村', 'LZC', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac60b0226', '440606103215', '440606103000', '440606103215', '大闸村', 'DZC', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac60b0227', '440606103216', '440606103000', '440606103216', '水藤村', 'STC', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac60b0228', '440606103217', '440606103000', '440606103217', '沙边村', 'SBC', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac60b0229', '440606103218', '440606103000', '440606103218', '罗沙村', 'LSC', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac60b022a', '440606103219', '440606103000', '440606103219', '杨滘村', 'YJC', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac60b022b', '440606104000', '440606000000', '440606104000', '龙江镇', 'LJZ', 4, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac60b022c', '440606104001', '440606104000', '440606104001', '龙江社区', 'LJSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac60b022d', '440606104002', '440606104000', '440606104002', '龙山社区', 'LSSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac60b022e', '440606104003', '440606104000', '440606104003', '排沙社区', 'PSSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac60b022f', '440606104004', '440606104000', '440606104004', '陈涌社区', 'CYSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac60b0230', '440606104005', '440606104000', '440606104005', '苏溪社区', 'SXSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac60b0231', '440606104006', '440606104000', '440606104006', '世埠社区', 'SBSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac60b0232', '440606104007', '440606104000', '440606104007', '西溪社区', 'XXSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac60b0233', '440606104008', '440606104000', '440606104008', '东涌社区', 'DYSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac60b0234', '440606104009', '440606104000', '440606104009', '坦西社区', 'TXSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac60b0235', '440606104010', '440606104000', '440606104010', '文华社区', 'WHSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac60b0236', '440606104201', '440606104000', '440606104201', '新华西村', 'XHXC', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac60b0237', '440606104206', '440606104000', '440606104206', '旺岗村', 'WGC', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac60b0238', '440606104207', '440606104000', '440606104207', '仙塘村', 'XTC', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac60b0239', '440606104208', '440606104000', '440606104208', '沙富村', 'SFC', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac60b023a', '440606104214', '440606104000', '440606104214', '集北村', 'JBC', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac60b023b', '440606104215', '440606104000', '440606104215', '东海村', 'DHC', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac60b023c', '440606104216', '440606104000', '440606104216', '官田村', 'GTC', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac60b023d', '440606104217', '440606104000', '440606104217', '麦朗村', 'MLC', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac60b023e', '440606104218', '440606104000', '440606104218', '西庆村', 'XQC', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac60b023f', '440606104219', '440606104000', '440606104219', '万安村', 'WAC', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac60b0240', '440606104220', '440606104000', '440606104220', '南坑村', 'NKC', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac60b0241', '440606104221', '440606104000', '440606104221', '东头村', 'DTC', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac60b0242', '440606104222', '440606104000', '440606104222', '左滩村', 'ZTC', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac60b0243', '440606105000', '440606000000', '440606105000', '杏坛镇', 'XTZ', 4, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac60b0244', '440606105001', '440606105000', '440606105001', '齐杏社区', 'QXSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac60b0245', '440606105002', '440606105000', '440606105002', '杏坛社区', 'XTSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac60b0246', '440606105003', '440606105000', '440606105003', '罗水社区', 'LSSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac60b0247', '440606105004', '440606105000', '440606105004', '吕地社区', 'LDSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac60b0248', '440606105005', '440606105000', '440606105005', '雁园社区', 'YYSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac60b0249', '440606105006', '440606105000', '440606105006', '马齐社区', 'MQSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac60b024a', '440606105206', '440606105000', '440606105206', '桑麻村', 'SMC', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac60b024b', '440606105207', '440606105000', '440606105207', '高赞村', 'GZC', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac60b024c', '440606105208', '440606105000', '440606105208', '上地村', 'SDC', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac60b024d', '440606105209', '440606105000', '440606105209', '新联村', 'XLC', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac60b024e', '440606105210', '440606105000', '440606105210', '海凌村', 'HLC', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac60b024f', '440606105211', '440606105000', '440606105211', '龙潭村', 'LTC', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac60b0250', '440606105212', '440606105000', '440606105212', '逢简村', 'FJC', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac60b0251', '440606105213', '440606105000', '440606105213', '北水村', 'BSC', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac60b0252', '440606105214', '440606105000', '440606105214', '吉祐村', 'JYC', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac60b0253', '440606105215', '440606105000', '440606105215', '南朗村', 'NLC', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac60b0254', '440606105216', '440606105000', '440606105216', '古朗村', 'GLC', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac60b0255', '440606105217', '440606105000', '440606105217', '昌教村', 'CJC', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac60b0256', '440606105218', '440606105000', '440606105218', '马宁村', 'MNC', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac60b0257', '440606105219', '440606105000', '440606105219', '马东村', 'MDC', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac60b0258', '440606105220', '440606105000', '440606105220', '西登村', 'XDC', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac6880259', '440606105221', '440606105000', '440606105221', '路涌村', 'LYC', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac688025a', '440606105222', '440606105000', '440606105222', '西北村', 'XBC', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac688025b', '440606105224', '440606105000', '440606105224', '光辉村', 'GHC', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac688025c', '440606105225', '440606105000', '440606105225', '麦村', 'MC', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac688025d', '440606105226', '440606105000', '440606105226', '光华村', 'GHC', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac688025e', '440606105227', '440606105000', '440606105227', '东村', 'DC', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac688025f', '440606105228', '440606105000', '440606105228', '南华村', 'NHC', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac6880260', '440606105229', '440606105000', '440606105229', '安富村', 'AFC', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac6880261', '440606105230', '440606105000', '440606105230', '右滩村', 'YTC', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac6880262', '440606106000', '440606000000', '440606106000', '均安镇', 'JAZ', 4, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac6880263', '440606106001', '440606106000', '440606106001', '均安社区', 'JASQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac6880264', '440606106002', '440606106000', '440606106002', '仓门社区', 'CMSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac6880265', '440606106003', '440606106000', '440606106003', '沙头社区', 'STSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac6880266', '440606106004', '440606106000', '440606106004', '天湖社区', 'THSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac6880267', '440606106005', '440606106000', '440606106005', '鹤峰社区', 'HFSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac6880268', '440606106006', '440606106000', '440606106006', '三华社区', 'SHSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac6880269', '440606106007', '440606106000', '440606106007', '新华社区', 'XHSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac688026a', '440606106008', '440606106000', '440606106008', '南沙社区', 'NSSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac688026b', '440606106201', '440606106000', '440606106201', '太平村', 'TPC', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac688026c', '440606106202', '440606106000', '440606106202', '南浦村', 'NPC', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac688026d', '440606106203', '440606106000', '440606106203', '星槎村', 'XCC', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac688026e', '440606106204', '440606106000', '440606106204', '沙浦村', 'SPC', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac688026f', '440606106205', '440606106000', '440606106205', '天连村', 'TLC', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac6880270', '440607000000', '440600000000', '440607000000', '三水区', 'SSQ', 3, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac6880271', '440607001000', '440607000000', '440607001000', '西南街道', 'XNJD', 4, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac6880272', '440607001001', '440607001000', '440607001001', '云秀社区', 'YXSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac6880273', '440607001002', '440607001000', '440607001002', '文锋西社区', 'WFXSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac6880274', '440607001006', '440607001000', '440607001006', '文锋东社区', 'WFDSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac6880275', '440607001008', '440607001000', '440607001008', '月桂社区', 'YGSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac6880276', '440607001011', '440607001000', '440607001011', '园林社区', 'YLSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac6880277', '440607001012', '440607001000', '440607001012', '桥头社区', 'QTSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac6880278', '440607001013', '440607001000', '440607001013', '康华社区', 'KHSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac6880279', '440607001015', '440607001000', '440607001015', '沙头社区', 'STSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac688027a', '440607001016', '440607001000', '440607001016', '张边社区', 'ZBSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac688027b', '440607001017', '440607001000', '440607001017', '布心社区', 'BXSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac688027c', '440607001021', '440607001000', '440607001021', '河口社区', 'HKSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac688027d', '440607001200', '440607001000', '440607001200', '董营村', 'DYC', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac688027e', '440607001201', '440607001000', '440607001201', '高丰村', 'GFC', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac688027f', '440607001202', '440607001000', '440607001202', '横涌村', 'HYC', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac6880280', '440607001206', '440607001000', '440607001206', '邓岗村', 'DGC', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac6980281', '440607001207', '440607001000', '440607001207', '石湖洲村', 'SHZC', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac6980282', '440607001226', '440607001000', '440607001226', '宝月村', 'BYC', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac6980283', '440607001229', '440607001000', '440607001229', '大塱山村', 'DLSC', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac6980284', '440607001232', '440607001000', '440607001232', '青岐村', 'QQC', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac6980285', '440607001234', '440607001000', '440607001234', '鲁村', 'LC', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac6980286', '440607001236', '440607001000', '440607001236', '南岸村', 'NAC', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac6980287', '440607001237', '440607001000', '440607001237', '五顶岗村', 'WDGC', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac6980288', '440607001238', '440607001000', '440607001238', '洲边村', 'ZBC', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac6980289', '440607001239', '440607001000', '440607001239', '江根村', 'JGC', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac698028a', '440607001240', '440607001000', '440607001240', '木棉村', 'MMC', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac698028b', '440607004000', '440607000000', '440607004000', '云东海街道', 'YDHJD', 4, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac698028c', '440607004001', '440607004000', '440607004001', '联合社区', 'LHSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac698028d', '440607004200', '440607004000', '440607004200', '伏户村', 'FHC', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac698028e', '440607004201', '440607004000', '440607004201', '辑罗村', 'JLC', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac698028f', '440607004202', '440607004000', '440607004202', '上九村', 'SJC', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac6980290', '440607004203', '440607004000', '440607004203', '杨梅村', 'YMC', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac6980291', '440607101000', '440607000000', '440607101000', '大塘镇', 'DTZ', 4, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac6980292', '440607101004', '440607101000', '440607101004', '大塘社区', 'DTSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac6980293', '440607101200', '440607101000', '440607101200', '永丰村', 'YFC', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac6980294', '440607101202', '440607101000', '440607101202', '莘田村', 'XTC', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac6980295', '440607101220', '440607101000', '440607101220', '永平村', 'YPC', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac6980296', '440607101221', '440607101000', '440607101221', '连滘村', 'LJC', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac6980297', '440607101222', '440607101000', '440607101222', '大塘村', 'DTC', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac6980298', '440607101223', '440607101000', '440607101223', '六一村', 'LYC', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac6980299', '440607101225', '440607101000', '440607101225', '潦边村', 'LBC', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac698029a', '440607103000', '440607000000', '440607103000', '乐平镇', 'LPZ', 4, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac698029b', '440607103001', '440607103000', '440607103001', '乐平社区', 'LPSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac698029c', '440607103002', '440607103000', '440607103002', '范湖社区', 'FHSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac698029d', '440607103003', '440607103000', '440607103003', '南边社区', 'NBSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac698029e', '440607103202', '440607103000', '440607103202', '新旗村', 'XQC', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac698029f', '440607103203', '440607103000', '440607103203', '乐平村', 'LPC', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac69802a0', '440607103204', '440607103000', '440607103204', '华布村', 'HBC', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac69802a1', '440607103207', '440607103000', '440607103207', '三溪村', 'SXC', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac69802a2', '440607103220', '440607103000', '440607103220', '念德村', 'NDC', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac69802a3', '440607103222', '440607103000', '440607103222', '黄塘村', 'HTC', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac69802a4', '440607103223', '440607103000', '440607103223', '保安村', 'BAC', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac69802a5', '440607103225', '440607103000', '440607103225', '源潭村', 'YTC', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac69802a6', '440607103226', '440607103000', '440607103226', '三江村', 'SJC', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac69802a7', '440607103227', '440607103000', '440607103227', '南联村', 'NLC', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac69802a8', '440607103228', '440607103000', '440607103228', '范湖村', 'FHC', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac69802a9', '440607103229', '440607103000', '440607103229', '大岗村', 'DGC', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac69802aa', '440607103230', '440607103000', '440607103230', '竹山村', 'ZSC', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac69802ab', '440607103231', '440607103000', '440607103231', '湖岗村', 'HGC', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac69802ac', '440607104000', '440607000000', '440607104000', '白坭镇', 'BNZ', 4, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac69802ad', '440607104002', '440607104000', '440607104002', '富景社区', 'FJSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac69802ae', '440607104213', '440607104000', '440607104213', '周村', 'ZC', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac69802af', '440607104214', '440607104000', '440607104214', '岗头村', 'GTC', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac69802b0', '440607105000', '440607000000', '440607105000', '芦苞镇', 'LBZ', 4, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac69802b1', '440607105003', '440607105000', '440607105003', '芦苞社区', 'LBSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac69802b2', '440607105200', '440607105000', '440607105200', '上塘村', 'STC', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac69802b3', '440607105201', '440607105000', '440607105201', '刘寨村', 'LZC', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac69802b4', '440607105216', '440607105000', '440607105216', '四联村', 'SLC', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac69802b5', '440607105217', '440607105000', '440607105217', '西河村', 'XHC', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac69802b6', '440607105218', '440607105000', '440607105218', '独树岗村', 'DSGC', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac69802b7', '440607105219', '440607105000', '440607105219', '四合村', 'SHC', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac69802b8', '440607106000', '440607000000', '440607106000', '南山镇', 'NSZ', 4, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac69802b9', '440607106001', '440607106000', '440607106001', '漫江社区', 'MJSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac69802ba', '440607106002', '440607106000', '440607106002', '择善社区', 'ZSSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac69802bb', '440607106003', '440607106000', '440607106003', '东和社区', 'DHSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac69802bc', '440607106004', '440607106000', '440607106004', '禾生社区', 'HSSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac70602bd', '440607106200', '440607106000', '440607106200', '六和村', 'LHC', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac70602be', '440608000000', '440600000000', '440608000000', '高明区', 'GMQ', 3, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac70602bf', '440608004000', '440608000000', '440608004000', '荷城街道', 'HCJD', 4, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac70602c0', '440608004001', '440608004000', '440608004001', '河江社区', 'HJSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac70602c1', '440608004002', '440608004000', '440608004002', '庆洲社区', 'QZSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac70602c2', '440608004005', '440608004000', '440608004005', '长安社区', 'ZASQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac70602c3', '440608004007', '440608004000', '440608004007', '中山社区', 'ZSSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac70602c4', '440608004009', '440608004000', '440608004009', '健力社区', 'JLSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac70602c5', '440608004010', '440608004000', '440608004010', '竹园社区', 'ZYSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac70602c6', '440608004012', '440608004000', '440608004012', '岭南社区', 'LNSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac70602c7', '440608004014', '440608004000', '440608004014', '金华社区', 'JHSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac70602c8', '440608004015', '440608004000', '440608004015', '安泰社区', 'ATSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac70602c9', '440608004017', '440608004000', '440608004017', '月明社区', 'YMSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac70602ca', '440608004019', '440608004000', '440608004019', '育才社区', 'YCSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac70602cb', '440608004022', '440608004000', '440608004022', '三洲社区', 'SZSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac70602cc', '440608004023', '440608004000', '440608004023', '江湾社区', 'JWSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac70602cd', '440608004024', '440608004000', '440608004024', '照明社区', 'ZMSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac70602ce', '440608004201', '440608004000', '440608004201', '上秀丽村', 'SXLC', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac70602cf', '440608004202', '440608004000', '440608004202', '罗西村', 'LXC', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac70602d0', '440608004203', '440608004000', '440608004203', '孔堂村', 'KTC', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac70602d1', '440608004204', '440608004000', '440608004204', '仙村', 'XC', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac70602d2', '440608004205', '440608004000', '440608004205', '尼教村', 'NJC', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac70602d3', '440608004206', '440608004000', '440608004206', '铁岗村', 'TGC', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac70602d4', '440608004207', '440608004000', '440608004207', '伦冲村', 'LCC', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac70602d5', '440608004208', '440608004000', '440608004208', '石洲村', 'SZC', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac70602d6', '440608004209', '440608004000', '440608004209', '南洲村', 'NZC', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac70602d7', '440608004210', '440608004000', '440608004210', '塘南村', 'TNC', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac70602d8', '440608004211', '440608004000', '440608004211', '泰兴村', 'TXC', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac70602d9', '440608004212', '440608004000', '440608004212', '泰和村', 'THC', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac70602da', '440608004213', '440608004000', '440608004213', '范洲村', 'FZC', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac70602db', '440608004214', '440608004000', '440608004214', '王臣村', 'WCC', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac70602dc', '440608106000', '440608000000', '440608106000', '杨和镇', 'YHZ', 4, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac70602dd', '440608106001', '440608106000', '440608106001', '人和社区', 'RHSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac70602de', '440608106002', '440608106000', '440608106002', '河东社区', 'HDSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac70602df', '440608106003', '440608106000', '440608106003', '河西社区', 'HXSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac70602e0', '440608106201', '440608106000', '440608106201', '对川村', 'DCC', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac70602e1', '440608106202', '440608106000', '440608106202', '岗水村', 'GSC', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac70602e2', '440608106203', '440608106000', '440608106203', '园岗村', 'YGC', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac70602e3', '440608106204', '440608106000', '440608106204', '豸岗村', 'ZGC', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac70602e4', '440608106205', '440608106000', '440608106205', '清泰村', 'QTC', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac70602e5', '440608106206', '440608106000', '440608106206', '沙水村', 'SSC', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac70602e6', '440608106207', '440608106000', '440608106207', '石水村', 'SSC', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac70602e7', '440608107000', '440608000000', '440608107000', '明城镇', 'MCZ', 4, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac70602e8', '440608107001', '440608107000', '440608107001', '明城社区', 'MCSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac70602e9', '440608107201', '440608107000', '440608107201', '明东村', 'MDC', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac70602ea', '440608107202', '440608107000', '440608107202', '明南村', 'MNC', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac70602eb', '440608107203', '440608107000', '440608107203', '明西村', 'MXC', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac70602ec', '440608107204', '440608107000', '440608107204', '明北村', 'MBC', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac70602ed', '440608107205', '440608107000', '440608107205', '明阳村', 'MYC', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac70602ee', '440608107206', '440608107000', '440608107206', '光明村', 'GMC', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac70602ef', '440608107207', '440608107000', '440608107207', '崇步村', 'CBC', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac70602f0', '440608107208', '440608107000', '440608107208', '潭朗村', 'TLC', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac70602f1', '440608107209', '440608107000', '440608107209', '新岗村', 'XGC', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac70602f2', '440608107210', '440608107000', '440608107210', '苗迳村', 'MJC', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac70602f3', '440608107211', '440608107000', '440608107211', '罗稳村', 'LWC', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac70602f4', '440608108000', '440608000000', '440608108000', '更合镇', 'GHZ', 4, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac70602f5', '440608108001', '440608108000', '440608108001', '更楼社区', 'GLSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac70602f6', '440608108002', '440608108000', '440608108002', '新圩社区', 'XWSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac70602f7', '440608108003', '440608108000', '440608108003', '合水社区', 'HSSQ', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac70602f8', '440608108201', '440608108000', '440608108201', '版村', 'BC', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac70602f9', '440608108202', '440608108000', '440608108202', '泽河村', 'ZHC', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac70602fa', '440608108203', '440608108000', '440608108203', '珠塘村', 'ZTC', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac70602fb', '440608108204', '440608108000', '440608108204', '大幕村', 'DMC', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac70602fc', '440608108205', '440608108000', '440608108205', '白石村', 'BSC', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac70602fd', '440608108206', '440608108000', '440608108206', '平塘村', 'PTC', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac70602fe', '440608108207', '440608108000', '440608108207', '歌乐村', 'GLC', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac70602ff', '440608108208', '440608108000', '440608108208', '官山村', 'GSC', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac7060300', '440608108209', '440608108000', '440608108209', '香山村', 'XSC', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac7060301', '440608108210', '440608108000', '440608108210', '布练村', 'BLC', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac7060302', '440608108211', '440608108000', '440608108211', '小洞村', 'XDC', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac7060303', '440608108212', '440608108000', '440608108212', '白洞村', 'BDC', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac7060304', '440608108213', '440608108000', '440608108213', '吉田村', 'JTC', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac7060305', '440608108214', '440608108000', '440608108214', '水井村', 'SJC', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac7060306', '440608108215', '440608108000', '440608108215', '巨泉村', 'JQC', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac7060307', '440608108216', '440608108000', '440608108216', '界村', 'JC', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac7060308', '440608108217', '440608108000', '440608108217', '良村', 'LC', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac7060309', '440608108218', '440608108000', '440608108218', '宅布村', 'ZBC', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc2abe015ebc2ac706030a', '440608108219', '440608108000', '440608108219', '高村', 'GC', 5, 'f', '2017-09-26 11:11:11', 'System', 'System', NULL, NULL, NULL, NULL, NULL, '系统默认添加,请勿修改或删除', NULL, 't');
INSERT INTO "public"."base_area" VALUES ('402883155ebc3a0c015ebc3d63930001', '440100000000', '440000000000', '440100000000', '广州市', 'GZS', 2, 'f', '2017-09-26 11:31:33', '402883d75d776653015d7769f0560001', 'cmb', NULL, NULL, NULL, NULL, NULL, '自定义添加', 1, 't');

-- ----------------------------
-- Table structure for base_items
-- ----------------------------
DROP TABLE IF EXISTS "public"."base_items";
CREATE TABLE "public"."base_items" (
  "id" varchar(64) COLLATE "pg_catalog"."default" NOT NULL,
  "mainid" int4 NOT NULL DEFAULT nextval('t_baseitems_mainid_seq'::regclass),
  "parentid" int4 NOT NULL,
  "encode" varchar(64) COLLATE "pg_catalog"."default" NOT NULL,
  "itemname" varchar(64) COLLATE "pg_catalog"."default" NOT NULL,
  "isdefault" bool NOT NULL DEFAULT false,
  "deletemark" bool NOT NULL DEFAULT false,
  "enabledmark" bool NOT NULL,
  "addtime" timestamp(6) NOT NULL,
  "adduserid" varchar(64) COLLATE "pg_catalog"."default" NOT NULL,
  "addusername" varchar(64) COLLATE "pg_catalog"."default" NOT NULL,
  "modifytime" timestamp(6),
  "modifyuserid" varchar(64) COLLATE "pg_catalog"."default" DEFAULT NULL::character varying,
  "modifyname" varchar(64) COLLATE "pg_catalog"."default" DEFAULT NULL::character varying,
  "deletename" varchar(64) COLLATE "pg_catalog"."default" DEFAULT NULL::character varying,
  "deletetime" timestamp(6),
  "remark" varchar(512) COLLATE "pg_catalog"."default" DEFAULT NULL::character varying,
  "sortcode" int4
)
;

-- ----------------------------
-- Records of base_items
-- ----------------------------
INSERT INTO "public"."base_items" VALUES ('1bb33ab8712c4cf0bf9e8dacb4e107471575877651798', 40, 13, 'test', 'test', 'f', 't', 't', '2019-12-09 15:47:31', '40288083679b5b0f01679b5b8d040000', 'sa', '2019-12-09 15:47:31', NULL, NULL, 'sa', '2019-12-09 16:56:28', '', 1);
INSERT INTO "public"."base_items" VALUES ('297ec62f5de9b537015de9e1186e0001', 1, 13, 'Education', '学历', 'f', 'f', 't', '2017-08-16 15:10:29', 'userId', 'account', '2017-08-21 15:52:48', '402883e25d597906015d597ad08a0003', 'bb', 'account', '2017-08-17 14:25:40', '学生学历', 1222);
INSERT INTO "public"."base_items" VALUES ('297ec62f5de9b537015dea038d3a0002', 2, 13, 'Certificate', '证件名称', 'f', 'f', 't', '2017-08-16 15:48:07', 'userId', 'account', '2017-08-21 15:51:54', '402883e25d597906015d597ad08a0003', 'bb', NULL, NULL, '证件名称', 10);
INSERT INTO "public"."base_items" VALUES ('297ec62f5de9b537015dea0ac33a0003', 3, 13, 'Marriage', '婚姻', 'f', 'f', 't', '2017-08-16 15:56:00', 'userId', 'account', '2017-08-21 15:51:12', '402883e25d597906015d597ad08a0003', 'bb', NULL, NULL, '婚姻', 99);
INSERT INTO "public"."base_items" VALUES ('297ec62f5de9b537015dea123b140004', 4, 13, 'Sex', '性别', 'f', 'f', 't', '2017-08-16 16:04:09', 'userId', 'account', '2017-08-21 15:53:00', '402883e25d597906015d597ad08a0003', 'bb', NULL, NULL, '男女性别', 12);
INSERT INTO "public"."base_items" VALUES ('402880836b01b712016b01b983980000', 39, 13, 'HealthServiceType', '服务类型', 'f', 'f', 't', '2019-05-29 11:54:23', '40288083679b5b0f01679b5b8d040000', 'sa', '2019-05-29 11:54:23', NULL, NULL, NULL, NULL, '服务类型', 99);
INSERT INTO "public"."base_items" VALUES ('402883155de8be9d015de8bf47980001', 12, 13, 'Birth', '生育', 'f', 'f', 't', '2017-08-16 09:53:37', 'userId', 'account', '2017-08-21 15:51:49', '402883e25d597906015d597ad08a0003', 'bb', NULL, NULL, '生育', 88);
INSERT INTO "public"."base_items" VALUES ('402883155de8be9d015de8c000700002', 13, 0, 'Sys_Items', '通用字典', 'f', 'f', 't', '2017-08-16 09:54:43', 'userId', 'account', '2017-08-21 15:49:37', '402883e25d597906015d597ad08a0003', 'bb', NULL, NULL, '', 99);
INSERT INTO "public"."base_items" VALUES ('402883155de8be9d015de8c50ebb0007', 14, 13, 'Nation', '民族', 'f', 'f', 't', '2017-08-16 10:00:14', 'userId', 'account', '2017-08-21 15:52:18', '402883e25d597906015d597ad08a0003', 'bb', NULL, NULL, '民族', 99);
INSERT INTO "public"."base_items" VALUES ('402883155e07a480015e07a831ab0001', 15, 13, 'CensusRegisterType', '户籍类型', 'f', 'f', 't', '2017-08-22 09:56:56', '402883d75d776653015d7769f0560001', 'cmb', NULL, NULL, NULL, NULL, NULL, '', 99);
INSERT INTO "public"."base_items" VALUES ('402883155e07a480015e07a8d4720002', 16, 13, 'PoliticalOutlookType', '政治面貌', 'f', 'f', 't', '2017-08-22 09:57:38', '402883d75d776653015d7769f0560001', 'cmb', '2017-08-22 09:57:55', '402883d75d776653015d7769f0560001', 'cmb', 'sa', '2019-02-22 11:26:03', '', 99);
INSERT INTO "public"."base_items" VALUES ('728c0f368e2b41028f199dd2f5f199e41576043239132', 1, 0, '11', 'hhii', 'f', 't', 't', '2019-12-11 13:47:19', '40288083679b5b0f01679b5b8d040000', 'sa', '2019-12-11 13:47:19', NULL, NULL, 'sa', '2019-12-11 13:49:04', '', 1);

-- ----------------------------
-- Table structure for base_itemsdetail
-- ----------------------------
DROP TABLE IF EXISTS "public"."base_itemsdetail";
CREATE TABLE "public"."base_itemsdetail" (
  "id" varchar(64) COLLATE "pg_catalog"."default" NOT NULL,
  "itemsid" varchar(64) COLLATE "pg_catalog"."default" NOT NULL,
  "encode" varchar(64) COLLATE "pg_catalog"."default" NOT NULL,
  "itemname" varchar(64) COLLATE "pg_catalog"."default" NOT NULL,
  "isdefault" bool NOT NULL DEFAULT false,
  "deletemark" bool NOT NULL DEFAULT false,
  "enabledmark" bool NOT NULL,
  "addtime" timestamp(6) NOT NULL,
  "adduserid" varchar(64) COLLATE "pg_catalog"."default" NOT NULL,
  "addusername" varchar(64) COLLATE "pg_catalog"."default" NOT NULL,
  "modifytime" timestamp(6),
  "modifyuserid" varchar(64) COLLATE "pg_catalog"."default" DEFAULT NULL::character varying,
  "modifyname" varchar(64) COLLATE "pg_catalog"."default" DEFAULT NULL::character varying,
  "deletename" varchar(64) COLLATE "pg_catalog"."default" DEFAULT NULL::character varying,
  "deletetime" timestamp(6),
  "remark" varchar(512) COLLATE "pg_catalog"."default" DEFAULT NULL::character varying,
  "sortcode" int4
)
;

-- ----------------------------
-- Records of base_itemsdetail
-- ----------------------------
INSERT INTO "public"."base_itemsdetail" VALUES ('7cc3186aab4c45aa919b5f76e009f4381576043327305', '728c0f368e2b41028f199dd2f5f199e41576043239132', '04', '04', 'f', 't', 't', '2019-12-11 13:48:47', '40288083679b5b0f01679b5b8d040000', 'sa', '2019-12-11 13:48:47', NULL, NULL, 'sa', '2019-12-11 13:48:54', '', 4);
INSERT INTO "public"."base_itemsdetail" VALUES ('f9468ca4df0e4d52a1d024dcaa71c0391576043284862', '728c0f368e2b41028f199dd2f5f199e41576043239132', '01', '01', 'f', 't', 't', '2019-12-11 13:48:04', '40288083679b5b0f01679b5b8d040000', 'sa', '2019-12-11 13:48:04', NULL, NULL, 'sa', '2019-12-11 13:49:04', '', 1);
INSERT INTO "public"."base_itemsdetail" VALUES ('954726a4d5cc4a34bbc6a3726a9ebe501576043296658', '728c0f368e2b41028f199dd2f5f199e41576043239132', '02', '02', 'f', 't', 't', '2019-12-11 13:48:16', '40288083679b5b0f01679b5b8d040000', 'sa', '2019-12-11 13:48:16', NULL, NULL, 'sa', '2019-12-11 13:49:04', '', 2);
INSERT INTO "public"."base_itemsdetail" VALUES ('40b8c57c33bc4680802e33a8b747c5ac1576043314870', '728c0f368e2b41028f199dd2f5f199e41576043239132', '03', '03', 'f', 't', 't', '2019-12-11 13:48:34', '40288083679b5b0f01679b5b8d040000', 'sa', '2019-12-11 13:48:34', NULL, NULL, 'sa', '2019-12-11 13:49:04', '', 3);
INSERT INTO "public"."base_itemsdetail" VALUES ('297ec62f5e02471d015e026bf2cd0001', '297ec62f5de9b537015de9e1186e0001', 'xiaoxue', '小学', 'f', 'f', 't', '2017-08-21 09:33:02', '402883e25d597906015d597ad08a0003', 'bb', NULL, NULL, NULL, 'account', '2017-08-25 10:42:54', '小学生', 1);
INSERT INTO "public"."base_itemsdetail" VALUES ('297ec62f5e02d351015e02d997d40001', '297ec62f5de9b537015de9e1186e0001', 'chuzhong', '初中', 'f', 'f', 't', '2017-08-21 11:32:48', '402883e25d597906015d597ad08a0003', 'bb', '2017-08-21 16:01:30', '402883e25d597906015d597ad08a0003', 'bb', NULL, NULL, '初中生', 2);
INSERT INTO "public"."base_itemsdetail" VALUES ('297ec62f5e02d351015e02f081a50002', '297ec62f5de9b537015dea123b140004', 'male', '男', 'f', 'f', 't', '2017-08-21 11:57:49', '402883e25d597906015d597ad08a0003', 'bb', '2017-08-21 11:58:40', '402883e25d597906015d597ad08a0003', 'bb', NULL, NULL, '男性', 1);
INSERT INTO "public"."base_itemsdetail" VALUES ('297ec62f5e02d351015e02f0be4f0003', '297ec62f5de9b537015dea123b140004', 'female', '女', 'f', 'f', 't', '2017-08-21 11:58:05', '402883e25d597906015d597ad08a0003', 'bb', '2017-08-21 11:58:31', '402883e25d597906015d597ad08a0003', 'bb', NULL, NULL, '女性', 2);
INSERT INTO "public"."base_itemsdetail" VALUES ('297ec62f5e0354b4015e03ca11710017', '297ec62f5de9b537015dea0ac33a0003', 'yihun', '已婚', 'f', 'f', 't', '2017-08-21 15:55:27', '402883e25d597906015d597ad08a0003', 'bb', NULL, NULL, NULL, NULL, NULL, '', 1);
INSERT INTO "public"."base_itemsdetail" VALUES ('297ec62f5e0354b4015e03ca7e5a0018', '297ec62f5de9b537015dea0ac33a0003', 'weihun', '未婚', 'f', 'f', 't', '2017-08-21 15:55:55', '402883e25d597906015d597ad08a0003', 'bb', NULL, NULL, NULL, NULL, NULL, '', 2);
INSERT INTO "public"."base_itemsdetail" VALUES ('297ec62f5e0354b4015e03cacc3d0019', '297ec62f5de9b537015dea0ac33a0003', 'liyi', '离异', 'f', 'f', 't', '2017-08-21 15:56:15', '402883e25d597906015d597ad08a0003', 'bb', NULL, NULL, NULL, NULL, NULL, '', 3);
INSERT INTO "public"."base_itemsdetail" VALUES ('297ec62f5e0354b4015e03cb08c4001a', '297ec62f5de9b537015dea0ac33a0003', 'sangou', '丧偶', 'f', 'f', 't', '2017-08-21 15:56:31', '402883e25d597906015d597ad08a0003', 'bb', NULL, NULL, NULL, NULL, NULL, '', 4);
INSERT INTO "public"."base_itemsdetail" VALUES ('297ec62f5e0354b4015e03cb515e001b', '297ec62f5de9b537015dea0ac33a0003', 'otherMarriage', '其他', 'f', 'f', 't', '2017-08-21 15:56:49', '402883e25d597906015d597ad08a0003', 'bb', '2017-08-21 16:00:37', '402883e25d597906015d597ad08a0003', 'bb', NULL, NULL, '', 5);
INSERT INTO "public"."base_itemsdetail" VALUES ('297ec62f5e0354b4015e03cbc182001c', '402883155de8be9d015de8bf47980001', 'yiyu', '已育', 'f', 'f', 't', '2017-08-21 15:57:18', '402883e25d597906015d597ad08a0003', 'bb', NULL, NULL, NULL, NULL, NULL, '', 1);
INSERT INTO "public"."base_itemsdetail" VALUES ('297ec62f5e0354b4015e03cc0d10001d', '402883155de8be9d015de8bf47980001', 'weiyu', '未育', 'f', 'f', 't', '2017-08-21 15:57:37', '402883e25d597906015d597ad08a0003', 'bb', NULL, NULL, NULL, NULL, NULL, '', 2);
INSERT INTO "public"."base_itemsdetail" VALUES ('297ec62f5e0354b4015e03cc7583001e', '297ec62f5de9b537015dea038d3a0002', 'shenfenzheng', '身份证', 'f', 'f', 't', '2017-08-21 15:58:04', '402883e25d597906015d597ad08a0003', 'bb', NULL, NULL, NULL, NULL, NULL, '', 1);
INSERT INTO "public"."base_itemsdetail" VALUES ('297ec62f5e0354b4015e03ccbfd0001f', '297ec62f5de9b537015dea038d3a0002', 'shibingzheng', '士兵证', 'f', 'f', 't', '2017-08-21 15:58:23', '402883e25d597906015d597ad08a0003', 'bb', NULL, NULL, NULL, NULL, NULL, '', 2);
INSERT INTO "public"."base_itemsdetail" VALUES ('297ec62f5e0354b4015e03cced910020', '297ec62f5de9b537015dea038d3a0002', 'junguanzheng', '军官证', 'f', 'f', 't', '2017-08-21 15:58:35', '402883e25d597906015d597ad08a0003', 'bb', NULL, NULL, NULL, NULL, NULL, '', 3);
INSERT INTO "public"."base_itemsdetail" VALUES ('297ec62f5e0354b4015e03cd42920021', '297ec62f5de9b537015dea038d3a0002', 'huzhao', '护照', 'f', 'f', 't', '2017-08-21 15:58:57', '402883e25d597906015d597ad08a0003', 'bb', NULL, NULL, NULL, NULL, NULL, '', 4);
INSERT INTO "public"."base_itemsdetail" VALUES ('297ec62f5e0354b4015e03ce774f0022', '297ec62f5de9b537015dea038d3a0002', 'otherCertificate', '其它', 'f', 'f', 't', '2017-08-21 16:00:16', '402883e25d597906015d597ad08a0003', 'bb', NULL, NULL, NULL, NULL, NULL, '', 5);
INSERT INTO "public"."base_itemsdetail" VALUES ('297ec62f5e0354b4015e03cf30110023', '402883155de8be9d015de8c50ebb0007', 'hanzu', '汉族', 'f', 'f', 't', '2017-08-21 16:01:03', '402883e25d597906015d597ad08a0003', 'bb', NULL, NULL, NULL, NULL, NULL, '', 1);
INSERT INTO "public"."base_itemsdetail" VALUES ('297ec62f5e0354b4015e03d063c80024', '297ec62f5de9b537015de9e1186e0001', 'dazhuan', '大专', 'f', 'f', 't', '2017-08-21 16:02:22', '402883e25d597906015d597ad08a0003', 'bb', '2017-10-17 14:48:36', '402883d75d776653015d7769f0560001', 'cmb', NULL, NULL, '', 3);
INSERT INTO "public"."base_itemsdetail" VALUES ('297ec62f5e0354b4015e03d0944d0025', '297ec62f5de9b537015de9e1186e0001', 'benke', '本科', 'f', 'f', 't', '2017-08-21 16:02:34', '402883e25d597906015d597ad08a0003', 'bb', '2017-10-17 14:48:43', '402883d75d776653015d7769f0560001', 'cmb', NULL, NULL, '', 4);
INSERT INTO "public"."base_itemsdetail" VALUES ('297ec62f5e0354b4015e03d0ddc50026', '297ec62f5de9b537015de9e1186e0001', 'shuoshi', '硕士', 'f', 'f', 't', '2017-08-21 16:02:53', '402883e25d597906015d597ad08a0003', 'bb', '2017-10-17 14:48:49', '402883d75d776653015d7769f0560001', 'cmb', NULL, NULL, '', 5);
INSERT INTO "public"."base_itemsdetail" VALUES ('297ec62f5e0354b4015e03d10e550027', '297ec62f5de9b537015de9e1186e0001', 'boshi', '博士', 'f', 'f', 't', '2017-08-21 16:03:05', '402883e25d597906015d597ad08a0003', 'bb', '2017-10-17 14:48:56', '402883d75d776653015d7769f0560001', 'cmb', NULL, NULL, '', 6);
INSERT INTO "public"."base_itemsdetail" VALUES ('297ec62f5e0354b4015e03d183640028', '297ec62f5de9b537015de9e1186e0001', 'otherEducation', '其他', 'f', 'f', 't', '2017-08-21 16:03:35', '402883e25d597906015d597ad08a0003', 'bb', '2017-10-17 14:49:04', '402883d75d776653015d7769f0560001', 'cmb', NULL, NULL, '', 7);
INSERT INTO "public"."base_itemsdetail" VALUES ('402880836b01b712016b01bb22d60001', '402880836b01b712016b01b983980000', 'HealthServiceType_GHYY', '挂号预约', 'f', 'f', 't', '2019-05-29 11:56:09', '40288083679b5b0f01679b5b8d040000', 'sa', '2019-05-29 11:56:09', NULL, NULL, NULL, NULL, '挂号预约', 1);
INSERT INTO "public"."base_itemsdetail" VALUES ('402880836b01b712016b01bc1e6c0002', '402880836b01b712016b01b983980000', 'HealthServiceType_JYPZ', '就医陪诊', 'f', 'f', 't', '2019-05-29 11:57:14', '40288083679b5b0f01679b5b8d040000', 'sa', '2019-05-29 11:57:14', NULL, NULL, NULL, NULL, '就医陪诊', 2);
INSERT INTO "public"."base_itemsdetail" VALUES ('402883155dedc844015dedccdb370001', '297ec62f5de9b537015de9e1186e0001', 'gaozhong', '高中', 'f', 'f', 't', '2017-08-17 09:26:48', 'userId', 'account', '2017-10-17 14:49:31', '402883d75d776653015d7769f0560001', 'cmb', 'account', '2017-08-17 16:35:19', '高中生', 8);
INSERT INTO "public"."base_itemsdetail" VALUES ('402883155deed86e015deeda04700001', '297ec62f5de9b537015de9e1186e0001', 'zhongzhuan', '中专', 'f', 'f', 't', '2017-08-17 14:20:49', 'userId', 'account', '2017-10-17 14:49:38', '402883d75d776653015d7769f0560001', 'cmb', 'account', '2017-08-17 14:25:40', '中专', 9);
INSERT INTO "public"."base_itemsdetail" VALUES ('402883155e07a480015e07ab7acb0004', '402883155e07a480015e07a831ab0001', 'nongyehukou', '农业户口', 'f', 'f', 't', '2017-08-22 10:00:32', '402883d75d776653015d7769f0560001', 'cmb', '2017-08-22 17:32:45', '402883d75d776653015d7769f0560001', 'cmb', NULL, NULL, '', 1);
INSERT INTO "public"."base_itemsdetail" VALUES ('402883155e07a480015e07ac549a0005', '402883155e07a480015e07a831ab0001', 'chengzhenhukou', '城镇户口', 'f', 'f', 't', '2017-08-22 10:01:27', '402883d75d776653015d7769f0560001', 'cmb', '2017-08-22 17:33:25', '402883d75d776653015d7769f0560001', 'cmb', NULL, NULL, '', 2);
INSERT INTO "public"."base_itemsdetail" VALUES ('402883155e07a480015e07ad91ea0006', '402883155e07a480015e07a8d4720002', 'putongqunzhong', '普通群众', 'f', 'f', 't', '2017-08-22 10:02:49', '402883d75d776653015d7769f0560001', 'cmb', '2017-08-22 17:25:34', '402883d75d776653015d7769f0560001', 'cmb', 'sa', '2019-02-22 11:26:03', '', 1);
INSERT INTO "public"."base_itemsdetail" VALUES ('402883155e07a480015e07ade6080007', '402883155e07a480015e07a8d4720002', 'gongqingtuanyuan', '共青团员', 'f', 'f', 't', '2017-08-22 10:03:10', '402883d75d776653015d7769f0560001', 'cmb', '2017-08-22 17:27:01', '402883d75d776653015d7769f0560001', 'cmb', 'sa', '2019-02-22 11:26:03', '', 2);
INSERT INTO "public"."base_itemsdetail" VALUES ('402883155e093545015e0944fff50001', '402883155e07a480015e07a8d4720002', 'zhongguodangyuan', '中共党员', 'f', 'f', 't', '2017-08-22 17:27:50', '402883d75d776653015d7769f0560001', 'cmb', NULL, NULL, NULL, 'sa', '2019-02-22 11:26:03', '', 3);
INSERT INTO "public"."base_itemsdetail" VALUES ('402883155e093545015e0945d1dd0002', '402883155e07a480015e07a8d4720002', 'minzhudangpai', '民主党派', 'f', 'f', 't', '2017-08-22 17:28:44', '402883d75d776653015d7769f0560001', 'cmb', NULL, NULL, NULL, 'sa', '2019-02-22 11:26:03', '', 4);
INSERT INTO "public"."base_itemsdetail" VALUES ('641e76a8af0a44b082d6443b0cb066e61575878024114', '1bb33ab8712c4cf0bf9e8dacb4e107471575877651798', 'test04', 'test04', 'f', 'f', 't', '2019-12-09 15:53:44', '40288083679b5b0f01679b5b8d040000', 'sa', '2019-12-09 15:53:44', NULL, NULL, 'sa', '2019-12-09 16:56:28', '', 4);
INSERT INTO "public"."base_itemsdetail" VALUES ('9ec14b74d1aa4cea97890c439ae07bf61575877720111', '1bb33ab8712c4cf0bf9e8dacb4e107471575877651798', 'test03', 'test03', 'f', 'f', 't', '2019-12-09 15:48:40', '40288083679b5b0f01679b5b8d040000', 'sa', '2019-12-09 15:48:40', NULL, NULL, 'sa', '2019-12-09 16:56:28', '', 3);
INSERT INTO "public"."base_itemsdetail" VALUES ('d5ac0c33798044cbaa7f0150e0198c551575877695031', '1bb33ab8712c4cf0bf9e8dacb4e107471575877651798', 'test02', 'test02', 'f', 'f', 't', '2019-12-09 15:48:15', '40288083679b5b0f01679b5b8d040000', 'sa', '2019-12-09 15:48:15', NULL, NULL, 'sa', '2019-12-09 16:56:28', '', 2);
INSERT INTO "public"."base_itemsdetail" VALUES ('edfba77e76954c3299b9501ec019055a1575877679261', '1bb33ab8712c4cf0bf9e8dacb4e107471575877651798', 'test01', 'test01', 'f', 'f', 't', '2019-12-09 15:47:59', '40288083679b5b0f01679b5b8d040000', 'sa', '2019-12-09 15:47:59', NULL, NULL, 'sa', '2019-12-09 16:56:28', '', 1);
INSERT INTO "public"."base_itemsdetail" VALUES ('f8cc9c7a5f059c9f015f2916cf01002a', '297ec62f5de9b537015de9e1186e0001', 'illiteracy', '文盲', 'f', 'f', 't', '2017-10-17 14:48:01', '402883d75d776653015d7769f0560001', 'cmb', NULL, NULL, NULL, NULL, NULL, '', 10);
INSERT INTO "public"."base_itemsdetail" VALUES ('f8cc9c7a5f059c9f015f29173859002b', '297ec62f5de9b537015de9e1186e0001', 'semIilliterate', '半文盲', 'f', 'f', 't', '2017-10-17 14:48:28', '402883d75d776653015d7769f0560001', 'cmb', NULL, NULL, NULL, NULL, NULL, '', 11);
INSERT INTO "public"."base_itemsdetail" VALUES ('f8cc9c7a5f059c9f015f291903f2002c', '402883155de8be9d015de8c50ebb0007', 'achangzu', '阿昌族', 'f', 'f', 't', '2017-10-17 14:50:26', '402883d75d776653015d7769f0560001', 'cmb', NULL, NULL, NULL, NULL, NULL, '', 2);
INSERT INTO "public"."base_itemsdetail" VALUES ('f8cc9c7a5f059c9f015f29195448002d', '402883155de8be9d015de8c50ebb0007', 'baizu', '白族', 'f', 'f', 't', '2017-10-17 14:50:46', '402883d75d776653015d7769f0560001', 'cmb', NULL, NULL, NULL, NULL, NULL, '', 3);
INSERT INTO "public"."base_itemsdetail" VALUES ('f8cc9c7a5f059c9f015f2919a24a002e', '402883155de8be9d015de8c50ebb0007', 'baoanzu', '保安族', 'f', 'f', 't', '2017-10-17 14:51:06', '402883d75d776653015d7769f0560001', 'cmb', NULL, NULL, NULL, NULL, NULL, '', 4);
INSERT INTO "public"."base_itemsdetail" VALUES ('f8cc9c7a5f059c9f015f291a0186002f', '402883155de8be9d015de8c50ebb0007', 'bulangzu', '布朗族', 'f', 'f', 't', '2017-10-17 14:51:31', '402883d75d776653015d7769f0560001', 'cmb', NULL, NULL, NULL, NULL, NULL, '', 5);
INSERT INTO "public"."base_itemsdetail" VALUES ('f8cc9c7a5f059c9f015f291a79d00030', '402883155de8be9d015de8c50ebb0007', 'buyizu', '布依族', 'f', 'f', 't', '2017-10-17 14:52:01', '402883d75d776653015d7769f0560001', 'cmb', NULL, NULL, NULL, NULL, NULL, '', 6);
INSERT INTO "public"."base_itemsdetail" VALUES ('f8cc9c7a5f059c9f015f291ad7470031', '402883155de8be9d015de8c50ebb0007', 'chaoxianzu', '朝鲜族', 'f', 'f', 't', '2017-10-17 14:52:25', '402883d75d776653015d7769f0560001', 'cmb', NULL, NULL, NULL, NULL, NULL, '', 7);
INSERT INTO "public"."base_itemsdetail" VALUES ('f8cc9c7a5f059c9f015f291b22da0032', '402883155de8be9d015de8c50ebb0007', 'daizu', '傣 族', 'f', 'f', 't', '2017-10-17 14:52:45', '402883d75d776653015d7769f0560001', 'cmb', NULL, NULL, NULL, NULL, NULL, '', 8);
INSERT INTO "public"."base_itemsdetail" VALUES ('f8cc9c7a5f059c9f015f291b6f010033', '402883155de8be9d015de8c50ebb0007', 'dawoerzu', '达斡尔族', 'f', 'f', 't', '2017-10-17 14:53:04', '402883d75d776653015d7769f0560001', 'cmb', NULL, NULL, NULL, NULL, NULL, '', 9);
INSERT INTO "public"."base_itemsdetail" VALUES ('f8cc9c7a5f059c9f015f291bbcd70034', '402883155de8be9d015de8c50ebb0007', 'deangzu', '德昂族', 'f', 'f', 't', '2017-10-17 14:53:24', '402883d75d776653015d7769f0560001', 'cmb', NULL, NULL, NULL, NULL, NULL, '', 10);
INSERT INTO "public"."base_itemsdetail" VALUES ('f8cc9c7a5f059c9f015f291c047a0035', '402883155de8be9d015de8c50ebb0007', 'dongxiangzu', '东乡族', 'f', 'f', 't', '2017-10-17 14:53:42', '402883d75d776653015d7769f0560001', 'cmb', NULL, NULL, NULL, NULL, NULL, '', 11);
INSERT INTO "public"."base_itemsdetail" VALUES ('f8cc9c7a5f059c9f015f291c6f2f0036', '402883155de8be9d015de8c50ebb0007', 'dongzu', '侗族', 'f', 'f', 't', '2017-10-17 14:54:10', '402883d75d776653015d7769f0560001', 'cmb', NULL, NULL, NULL, NULL, NULL, '', 12);
INSERT INTO "public"."base_itemsdetail" VALUES ('f8cc9c7a5f059c9f015f291ccac70037', '402883155de8be9d015de8c50ebb0007', 'dulongzu', '独龙族', 'f', 'f', 't', '2017-10-17 14:54:33', '402883d75d776653015d7769f0560001', 'cmb', NULL, NULL, NULL, NULL, NULL, '', 13);
INSERT INTO "public"."base_itemsdetail" VALUES ('f8cc9c7a5f059c9f015f291d1ce00038', '402883155de8be9d015de8c50ebb0007', 'ewenkezu', '鄂温克族', 'f', 'f', 't', '2017-10-17 14:54:54', '402883d75d776653015d7769f0560001', 'cmb', NULL, NULL, NULL, NULL, NULL, '', 14);
INSERT INTO "public"."base_itemsdetail" VALUES ('f8cc9c7a5f059c9f015f291d6d610039', '402883155de8be9d015de8c50ebb0007', 'elunchunzu', '鄂伦春族', 'f', 'f', 't', '2017-10-17 14:55:15', '402883d75d776653015d7769f0560001', 'cmb', NULL, NULL, NULL, NULL, NULL, '', 15);
INSERT INTO "public"."base_itemsdetail" VALUES ('f8cc9c7a5f059c9f015f291dbc45003a', '402883155de8be9d015de8c50ebb0007', 'eluosizu', '俄罗斯族', 'f', 'f', 't', '2017-10-17 14:55:35', '402883d75d776653015d7769f0560001', 'cmb', NULL, NULL, NULL, NULL, NULL, '', 16);
INSERT INTO "public"."base_itemsdetail" VALUES ('f8cc9c7a5f059c9f015f291e0516003b', '402883155de8be9d015de8c50ebb0007', 'gaoshanzu', '高山族', 'f', 'f', 't', '2017-10-17 14:55:54', '402883d75d776653015d7769f0560001', 'cmb', NULL, NULL, NULL, NULL, NULL, '', 17);
INSERT INTO "public"."base_itemsdetail" VALUES ('f8cc9c7a5f059c9f015f291e4d54003c', '402883155de8be9d015de8c50ebb0007', 'hasakezu', '哈萨克族', 'f', 'f', 't', '2017-10-17 14:56:12', '402883d75d776653015d7769f0560001', 'cmb', NULL, NULL, NULL, NULL, NULL, '', 18);
INSERT INTO "public"."base_itemsdetail" VALUES ('f8cc9c7a5f059c9f015f291e9720003d', '402883155de8be9d015de8c50ebb0007', 'hanizu', '哈尼族', 'f', 'f', 't', '2017-10-17 14:56:31', '402883d75d776653015d7769f0560001', 'cmb', NULL, NULL, NULL, NULL, NULL, '', 19);
INSERT INTO "public"."base_itemsdetail" VALUES ('f8cc9c7a5f059c9f015f291ee714003e', '402883155de8be9d015de8c50ebb0007', 'hezhezu', '赫哲族', 'f', 'f', 't', '2017-10-17 14:56:51', '402883d75d776653015d7769f0560001', 'cmb', NULL, NULL, NULL, NULL, NULL, '', 20);
INSERT INTO "public"."base_itemsdetail" VALUES ('f8cc9c7a5f059c9f015f291f3619003f', '402883155de8be9d015de8c50ebb0007', 'huizu', '回族', 'f', 'f', 't', '2017-10-17 14:57:12', '402883d75d776653015d7769f0560001', 'cmb', NULL, NULL, NULL, NULL, NULL, '', 21);
INSERT INTO "public"."base_itemsdetail" VALUES ('f8cc9c7a5f059c9f015f291f8d9d0040', '402883155de8be9d015de8c50ebb0007', 'jinuozu', '基诺族', 'f', 'f', 't', '2017-10-17 14:57:34', '402883d75d776653015d7769f0560001', 'cmb', NULL, NULL, NULL, NULL, NULL, '', 22);
INSERT INTO "public"."base_itemsdetail" VALUES ('f8cc9c7a5f059c9f015f291feb530041', '402883155de8be9d015de8c50ebb0007', 'jingpozu', '景颇族', 'f', 'f', 't', '2017-10-17 14:57:58', '402883d75d776653015d7769f0560001', 'cmb', NULL, NULL, NULL, NULL, NULL, '', 23);
INSERT INTO "public"."base_itemsdetail" VALUES ('f8cc9c7a5f059c9f015f292039c40042', '402883155de8be9d015de8c50ebb0007', 'jingzu', '京族', 'f', 'f', 't', '2017-10-17 14:58:18', '402883d75d776653015d7769f0560001', 'cmb', NULL, NULL, NULL, NULL, NULL, '', 24);
INSERT INTO "public"."base_itemsdetail" VALUES ('f8cc9c7a5f059c9f015f29207e200043', '402883155de8be9d015de8c50ebb0007', 'keerkezizu', '柯尔克孜族', 'f', 'f', 't', '2017-10-17 14:58:36', '402883d75d776653015d7769f0560001', 'cmb', NULL, NULL, NULL, NULL, NULL, '', 25);
INSERT INTO "public"."base_itemsdetail" VALUES ('f8cc9c7a5f059c9f015f2920c83e0044', '402883155de8be9d015de8c50ebb0007', 'yilaozu', '仡佬族', 'f', 'f', 't', '2017-10-17 14:58:55', '402883d75d776653015d7769f0560001', 'cmb', NULL, NULL, NULL, NULL, NULL, '', 26);
INSERT INTO "public"."base_itemsdetail" VALUES ('f8cc9c7a5f059c9f015f29210e950045', '402883155de8be9d015de8c50ebb0007', 'lahuzu', '拉祜族', 'f', 'f', 't', '2017-10-17 14:59:13', '402883d75d776653015d7769f0560001', 'cmb', NULL, NULL, NULL, NULL, NULL, '', 27);
INSERT INTO "public"."base_itemsdetail" VALUES ('f8cc9c7a5f059c9f015f29214d2f0046', '402883155de8be9d015de8c50ebb0007', 'lizu', '黎族', 'f', 'f', 't', '2017-10-17 14:59:29', '402883d75d776653015d7769f0560001', 'cmb', NULL, NULL, NULL, NULL, NULL, '', 28);
INSERT INTO "public"."base_itemsdetail" VALUES ('f8cc9c7a5f059c9f015f2921a7f50047', '402883155de8be9d015de8c50ebb0007', 'lisuzu', '傈僳族', 'f', 'f', 't', '2017-10-17 14:59:52', '402883d75d776653015d7769f0560001', 'cmb', NULL, NULL, NULL, NULL, NULL, '', 29);
INSERT INTO "public"."base_itemsdetail" VALUES ('f8cc9c7a5f059c9f015f2921f7380048', '402883155de8be9d015de8c50ebb0007', 'luobazu', '珞巴族', 'f', 'f', 't', '2017-10-17 15:00:12', '402883d75d776653015d7769f0560001', 'cmb', NULL, NULL, NULL, NULL, NULL, '', 30);
INSERT INTO "public"."base_itemsdetail" VALUES ('f8cc9c7a5f059c9f015f2922485c0049', '402883155de8be9d015de8c50ebb0007', 'manzu', '满族', 'f', 'f', 't', '2017-10-17 15:00:33', '402883d75d776653015d7769f0560001', 'cmb', NULL, NULL, NULL, NULL, NULL, '', 31);
INSERT INTO "public"."base_itemsdetail" VALUES ('f8cc9c7a5f059c9f015f29228a05004a', '402883155de8be9d015de8c50ebb0007', 'maonanzu', '毛南族', 'f', 'f', 't', '2017-10-17 15:00:50', '402883d75d776653015d7769f0560001', 'cmb', NULL, NULL, NULL, NULL, NULL, '', 32);
INSERT INTO "public"."base_itemsdetail" VALUES ('f8cc9c7a5f059c9f015f2922d0e3004b', '402883155de8be9d015de8c50ebb0007', 'menbazu', '门巴族', 'f', 'f', 't', '2017-10-17 15:01:08', '402883d75d776653015d7769f0560001', 'cmb', NULL, NULL, NULL, NULL, NULL, '', 33);
INSERT INTO "public"."base_itemsdetail" VALUES ('f8cc9c7a5f059c9f015f292317a2004c', '402883155de8be9d015de8c50ebb0007', 'mengguzu', '蒙古族', 'f', 'f', 't', '2017-10-17 15:01:26', '402883d75d776653015d7769f0560001', 'cmb', NULL, NULL, NULL, NULL, NULL, '', 34);
INSERT INTO "public"."base_itemsdetail" VALUES ('f8cc9c7a5f059c9f015f29236817004d', '402883155de8be9d015de8c50ebb0007', 'miaozu', '苗族', 'f', 'f', 't', '2017-10-17 15:01:47', '402883d75d776653015d7769f0560001', 'cmb', NULL, NULL, NULL, NULL, NULL, '', 35);
INSERT INTO "public"."base_itemsdetail" VALUES ('f8cc9c7a5f059c9f015f2923bd4d004e', '402883155de8be9d015de8c50ebb0007', 'mulaozu', '仫佬族', 'f', 'f', 't', '2017-10-17 15:02:08', '402883d75d776653015d7769f0560001', 'cmb', NULL, NULL, NULL, NULL, NULL, '', 36);
INSERT INTO "public"."base_itemsdetail" VALUES ('f8cc9c7a5f059c9f015f29241ead004f', '402883155de8be9d015de8c50ebb0007', 'naxizu', '纳西族', 'f', 'f', 't', '2017-10-17 15:02:33', '402883d75d776653015d7769f0560001', 'cmb', NULL, NULL, NULL, NULL, NULL, '', 37);
INSERT INTO "public"."base_itemsdetail" VALUES ('f8cc9c7a5f059c9f015f292481300050', '402883155de8be9d015de8c50ebb0007', 'nuzu', '怒族', 'f', 'f', 't', '2017-10-17 15:02:59', '402883d75d776653015d7769f0560001', 'cmb', NULL, NULL, NULL, NULL, NULL, '', 38);
INSERT INTO "public"."base_itemsdetail" VALUES ('f8cc9c7a5f059c9f015f2924e4030051', '402883155de8be9d015de8c50ebb0007', 'pumizu', '普米族', 'f', 'f', 't', '2017-10-17 15:03:24', '402883d75d776653015d7769f0560001', 'cmb', NULL, NULL, NULL, NULL, NULL, '', 39);
INSERT INTO "public"."base_itemsdetail" VALUES ('f8cc9c7a5f059c9f015f29253f080052', '402883155de8be9d015de8c50ebb0007', 'qiangzu', '羌族', 'f', 'f', 't', '2017-10-17 15:03:47', '402883d75d776653015d7769f0560001', 'cmb', NULL, NULL, NULL, NULL, NULL, '', 40);
INSERT INTO "public"."base_itemsdetail" VALUES ('f8cc9c7a5f059c9f015f2925f6850053', '402883155de8be9d015de8c50ebb0007', 'salazu', '撒拉族', 'f', 'f', 't', '2017-10-17 15:04:34', '402883d75d776653015d7769f0560001', 'cmb', NULL, NULL, NULL, NULL, NULL, '', 41);
INSERT INTO "public"."base_itemsdetail" VALUES ('f8cc9c7a5f059c9f015f29267c0d0054', '402883155de8be9d015de8c50ebb0007', 'shezu', '畲族', 'f', 'f', 't', '2017-10-17 15:05:08', '402883d75d776653015d7769f0560001', 'cmb', NULL, NULL, NULL, NULL, NULL, '', 42);
INSERT INTO "public"."base_itemsdetail" VALUES ('f8cc9c7a5f059c9f015f2926d4760055', '402883155de8be9d015de8c50ebb0007', 'shuizu', '水族', 'f', 'f', 't', '2017-10-17 15:05:31', '402883d75d776653015d7769f0560001', 'cmb', NULL, NULL, NULL, NULL, NULL, '', 43);
INSERT INTO "public"."base_itemsdetail" VALUES ('f8cc9c7a5f059c9f015f292739260056', '402883155de8be9d015de8c50ebb0007', 'tataerzu', '塔塔尔族', 'f', 'f', 't', '2017-10-17 15:05:57', '402883d75d776653015d7769f0560001', 'cmb', NULL, NULL, NULL, NULL, NULL, '', 44);
INSERT INTO "public"."base_itemsdetail" VALUES ('f8cc9c7a5f059c9f015f29279f5e0057', '402883155de8be9d015de8c50ebb0007', 'tajikezu', '塔吉克族', 'f', 'f', 't', '2017-10-17 15:06:23', '402883d75d776653015d7769f0560001', 'cmb', NULL, NULL, NULL, NULL, NULL, '', 45);
INSERT INTO "public"."base_itemsdetail" VALUES ('f8cc9c7a5f059c9f015f2927f9be0058', '402883155de8be9d015de8c50ebb0007', 'tuzu', '土族', 'f', 'f', 't', '2017-10-17 15:06:46', '402883d75d776653015d7769f0560001', 'cmb', NULL, NULL, NULL, NULL, NULL, '', 46);
INSERT INTO "public"."base_itemsdetail" VALUES ('f8cc9c7a5f059c9f015f2928578b0059', '402883155de8be9d015de8c50ebb0007', 'tujiazu', '土家族', 'f', 'f', 't', '2017-10-17 15:07:10', '402883d75d776653015d7769f0560001', 'cmb', NULL, NULL, NULL, NULL, NULL, '', 47);
INSERT INTO "public"."base_itemsdetail" VALUES ('f8cc9c7a5f059c9f015f2928b3eb005a', '402883155de8be9d015de8c50ebb0007', 'wazu', '佤族', 'f', 'f', 't', '2017-10-17 15:07:34', '402883d75d776653015d7769f0560001', 'cmb', NULL, NULL, NULL, NULL, NULL, '', 48);
INSERT INTO "public"."base_itemsdetail" VALUES ('f8cc9c7a5f059c9f015f29290f96005b', '402883155de8be9d015de8c50ebb0007', 'werwuerzu', '维吾尔族', 'f', 'f', 't', '2017-10-17 15:07:57', '402883d75d776653015d7769f0560001', 'cmb', NULL, NULL, NULL, NULL, NULL, '', 49);
INSERT INTO "public"."base_itemsdetail" VALUES ('f8cc9c7a5f059c9f015f292974fe005c', '402883155de8be9d015de8c50ebb0007', 'wuzibiekezu', '乌孜别克族', 'f', 'f', 't', '2017-10-17 15:08:23', '402883d75d776653015d7769f0560001', 'cmb', NULL, NULL, NULL, NULL, NULL, '', 50);
INSERT INTO "public"."base_itemsdetail" VALUES ('f8cc9c7a5f059c9f015f2929d528005d', '402883155de8be9d015de8c50ebb0007', 'xibozu', '锡伯族', 'f', 'f', 't', '2017-10-17 15:08:48', '402883d75d776653015d7769f0560001', 'cmb', NULL, NULL, NULL, NULL, NULL, '', 51);
INSERT INTO "public"."base_itemsdetail" VALUES ('f8cc9c7a5f059c9f015f292a4434005e', '402883155de8be9d015de8c50ebb0007', 'yaozu', '瑶族', 'f', 'f', 't', '2017-10-17 15:09:16', '402883d75d776653015d7769f0560001', 'cmb', NULL, NULL, NULL, NULL, NULL, '', 52);
INSERT INTO "public"."base_itemsdetail" VALUES ('f8cc9c7a5f059c9f015f292aa103005f', '402883155de8be9d015de8c50ebb0007', 'yizu', '彝族', 'f', 'f', 't', '2017-10-17 15:09:40', '402883d75d776653015d7769f0560001', 'cmb', NULL, NULL, NULL, NULL, NULL, '', 53);
INSERT INTO "public"."base_itemsdetail" VALUES ('f8cc9c7a5f059c9f015f292afe700060', '402883155de8be9d015de8c50ebb0007', 'yuguzu', '裕固族', 'f', 'f', 't', '2017-10-17 15:10:04', '402883d75d776653015d7769f0560001', 'cmb', NULL, NULL, NULL, NULL, NULL, '', 54);
INSERT INTO "public"."base_itemsdetail" VALUES ('f8cc9c7a5f059c9f015f292b6e200061', '402883155de8be9d015de8c50ebb0007', 'zhangzu', '藏族', 'f', 'f', 't', '2017-10-17 15:10:32', '402883d75d776653015d7769f0560001', 'cmb', NULL, NULL, NULL, NULL, NULL, '', 55);
INSERT INTO "public"."base_itemsdetail" VALUES ('f8cc9c7a5f059c9f015f292bc88c0062', '402883155de8be9d015de8c50ebb0007', 'zhuangzu', '壮族', 'f', 'f', 't', '2017-10-17 15:10:56', '402883d75d776653015d7769f0560001', 'cmb', NULL, NULL, NULL, NULL, NULL, '', 56);
INSERT INTO "public"."base_itemsdetail" VALUES ('f8cc9c7a5f059c9f015f292c8a260063', '402883155e07a480015e07a8d4720002', 'zhonggongyubeidy', '中共预备党员', 'f', 'f', 't', '2017-10-17 15:11:45', '402883d75d776653015d7769f0560001', 'cmb', NULL, NULL, NULL, 'sa', '2019-02-22 11:26:03', '', 5);
INSERT INTO "public"."base_itemsdetail" VALUES ('f8cc9c7a5f059c9f015f292cd8ba0064', '402883155e07a480015e07a8d4720002', 'mingedangyuan', '民革党员', 'f', 'f', 't', '2017-10-17 15:12:05', '402883d75d776653015d7769f0560001', 'cmb', NULL, NULL, NULL, 'sa', '2019-02-22 11:26:03', '', 6);
INSERT INTO "public"."base_itemsdetail" VALUES ('f8cc9c7a5f059c9f015f292d31f00065', '402883155e07a480015e07a8d4720002', 'minmengmengyuan', '民盟盟员', 'f', 'f', 't', '2017-10-17 15:12:28', '402883d75d776653015d7769f0560001', 'cmb', NULL, NULL, NULL, 'sa', '2019-02-22 11:26:03', '', 7);
INSERT INTO "public"."base_itemsdetail" VALUES ('f8cc9c7a5f059c9f015f292da6e80066', '402883155e07a480015e07a8d4720002', 'minjianhuiyuan', '民建会员', 'f', 'f', 't', '2017-10-17 15:12:58', '402883d75d776653015d7769f0560001', 'cmb', NULL, NULL, NULL, 'sa', '2019-02-22 11:26:03', '', 8);
INSERT INTO "public"."base_itemsdetail" VALUES ('f8cc9c7a5f059c9f015f292df16d0067', '402883155e07a480015e07a8d4720002', 'minjinhuiyuan', '民进会员', 'f', 'f', 't', '2017-10-17 15:13:17', '402883d75d776653015d7769f0560001', 'cmb', NULL, NULL, NULL, 'sa', '2019-02-22 11:26:03', '', 9);
INSERT INTO "public"."base_itemsdetail" VALUES ('f8cc9c7a5f059c9f015f292e3a7d0068', '402883155e07a480015e07a8d4720002', 'nonggongdangdangyuan', '农工党党员', 'f', 'f', 't', '2017-10-17 15:13:36', '402883d75d776653015d7769f0560001', 'cmb', NULL, NULL, NULL, 'sa', '2019-02-22 11:26:03', '', 10);
INSERT INTO "public"."base_itemsdetail" VALUES ('f8cc9c7a5f059c9f015f292e90170069', '402883155e07a480015e07a8d4720002', 'zhigongdangdangyuan', '致公党党员', 'f', 'f', 't', '2017-10-17 15:13:58', '402883d75d776653015d7769f0560001', 'cmb', NULL, NULL, NULL, 'sa', '2019-02-22 11:26:03', '', 11);
INSERT INTO "public"."base_itemsdetail" VALUES ('f8cc9c7a5f059c9f015f292eeb5e006a', '402883155e07a480015e07a8d4720002', 'jiusanxueshesheyuan', '九三学社社员', 'f', 'f', 't', '2017-10-17 15:14:21', '402883d75d776653015d7769f0560001', 'cmb', NULL, NULL, NULL, 'sa', '2019-02-22 11:26:03', '', 12);
INSERT INTO "public"."base_itemsdetail" VALUES ('f8cc9c7a5f059c9f015f292f3d07006b', '402883155e07a480015e07a8d4720002', 'taimengmengyuan', '台盟盟员', 'f', 'f', 't', '2017-10-17 15:14:42', '402883d75d776653015d7769f0560001', 'cmb', NULL, NULL, NULL, 'sa', '2019-02-22 11:26:03', '', 13);
INSERT INTO "public"."base_itemsdetail" VALUES ('f8cc9c7a5f059c9f015f292f9719006c', '402883155e07a480015e07a8d4720002', 'wudangpaiminzhurs', '无党派民主人士', 'f', 'f', 't', '2017-10-17 15:15:05', '402883d75d776653015d7769f0560001', 'cmb', NULL, NULL, NULL, 'sa', '2019-02-22 11:26:03', '', 14);
INSERT INTO "public"."base_itemsdetail" VALUES ('f8cc9c7a5f327ce4015f33802fa90003', '402883155e07a480015e07a831ab0001', 'weizhi', '未知', 'f', 'f', 't', '2017-10-19 15:19:19', '402883e25d597906015d597ad08a0003', 'bb', '2019-11-28 09:32:07', '40288083679b5b0f01679b5b8d040000', 'sa', NULL, NULL, '未知用户户籍类型.', 0);
INSERT INTO "public"."base_itemsdetail" VALUES ('f8cc9c7a5f327ce4015f338457590004', '402883155de8be9d015de8c50ebb0007', 'weizhi1', '未知', 'f', 'f', 't', '2017-10-19 15:23:52', '402883e25d597906015d597ad08a0003', 'bb', NULL, NULL, NULL, NULL, NULL, '未知用户该项数据', 1);
INSERT INTO "public"."base_itemsdetail" VALUES ('f8cc9c7a5f327ce4015f338623620005', '297ec62f5de9b537015dea0ac33a0003', 'weizhi2', '未知', 'f', 'f', 't', '2017-10-19 15:25:49', '402883e25d597906015d597ad08a0003', 'bb', NULL, NULL, NULL, NULL, NULL, '未知用户该项目数据', 1);

-- ----------------------------
-- Table structure for base_manager
-- ----------------------------
DROP TABLE IF EXISTS "public"."base_manager";
CREATE TABLE "public"."base_manager" (
  "id" varchar(64) COLLATE "pg_catalog"."default" NOT NULL,
  "account" varchar(64) COLLATE "pg_catalog"."default" NOT NULL,
  "password" varchar(64) COLLATE "pg_catalog"."default" NOT NULL,
  "salt" varchar(64) COLLATE "pg_catalog"."default" NOT NULL,
  "realname" varchar(64) COLLATE "pg_catalog"."default" NOT NULL,
  "telephone" varchar(64) COLLATE "pg_catalog"."default" DEFAULT NULL::character varying,
  "email" varchar(64) COLLATE "pg_catalog"."default" DEFAULT NULL::character varying,
  "islock" bool NOT NULL DEFAULT true,
  "addtime" timestamp(6) NOT NULL,
  "adduserid" varchar(64) COLLATE "pg_catalog"."default" NOT NULL,
  "addusername" varchar(64) COLLATE "pg_catalog"."default" NOT NULL,
  "modifytime" timestamp(6),
  "modifyuserid" varchar(64) COLLATE "pg_catalog"."default" DEFAULT NULL::character varying,
  "modifyname" varchar(64) COLLATE "pg_catalog"."default" DEFAULT NULL::character varying,
  "deletename" varchar(64) COLLATE "pg_catalog"."default" DEFAULT NULL::character varying,
  "deletemark" bool NOT NULL DEFAULT false,
  "deletetime" timestamp(6),
  "remark" varchar(512) COLLATE "pg_catalog"."default" DEFAULT NULL::character varying,
  "sortcode" int4 DEFAULT 1,
  "worknumber" varchar(64) COLLATE "pg_catalog"."default" DEFAULT NULL::character varying,
  "extentionnumber" varchar(64) COLLATE "pg_catalog"."default" DEFAULT NULL::character varying
)
;

-- ----------------------------
-- Records of base_manager
-- ----------------------------
INSERT INTO "public"."base_manager" VALUES ('402880826879cfec016879e9b4700002', 'Sasuke', '1719d87b3d9bfeed4d8407d360f39678', 'p7kutv', '宇智波佐助', '', '', 'f', '2019-01-23 16:53:05', '40288083679b5b0f01679b5b8d040000', 'sa', '2019-01-23 16:53:05', NULL, NULL, 'sa', 't', '2019-10-29 14:25:49', '', 3, '0', '0');
INSERT INTO "public"."base_manager" VALUES ('40288083679b5b0f01679b5b8d040000', 'sa', '5abc90ac5099a0a1856a786cf5493906', 'nakl9x', 'sa', '', '', 'f', '2018-12-12 12:12:12', 'sa', 'sa', '2019-01-11 10:39:25', '40288083679b5b0f01679b5b8d040000', 'sa', NULL, 'f', NULL, 'super admin', 1, '1', '1');
INSERT INTO "public"."base_manager" VALUES ('40288083685425d901685427f0590000', 'test', '63b37991ce6e71c273377bd348d3a563', 'mn45gc', '测试', '', '', 'f', '2019-01-16 08:55:30', '40288083679b5b0f01679b5b8d040000', 'sa', '2019-01-16 08:55:30', NULL, NULL, 'sa', 't', '2019-10-29 14:25:54', '测试', 99, '0', '0');
INSERT INTO "public"."base_manager" VALUES ('67ef53697b9641a6898324e2f71675ee1572330403444', 'pangu-test', 'f6eb21ab5a1222450593306de69a9b99', 'nq32sq', '盘古测试', '', '', 'f', '2019-10-29 14:26:43', '40288083679b5b0f01679b5b8d040000', 'sa', '2019-10-29 14:26:43', NULL, NULL, NULL, 'f', NULL, '盘古测试', 1, '0', '0');
INSERT INTO "public"."base_manager" VALUES ('b1d891660f9c45f6ac9212113b3722c51572940358366', 'taibao', '902e81294a61fa129b635649494527bd', 'vu3kts', '测试', '', '', 'f', '2019-11-05 15:52:38', 'e1b0280a1d534a15bd7ce11dec44f2051572852405632', 'taibao-test', '2019-12-09 15:38:59', '40288083679b5b0f01679b5b8d040000', 'sa', NULL, 'f', NULL, '', 111, '0', '0');
INSERT INTO "public"."base_manager" VALUES ('e1b0280a1d534a15bd7ce11dec44f2051572852405632', 'taibao-test', '52a905f5fbe7844ee65d75729bbcf64e', 't1lspq', '太保测试', '', '', 'f', '2019-11-04 15:26:45', '40288083679b5b0f01679b5b8d040000', 'sa', '2019-11-04 15:26:45', NULL, NULL, NULL, 'f', NULL, '', 1, '0', '0');

-- ----------------------------
-- Table structure for base_manager_role
-- ----------------------------
DROP TABLE IF EXISTS "public"."base_manager_role";
CREATE TABLE "public"."base_manager_role" (
  "id" varchar(64) COLLATE "pg_catalog"."default" NOT NULL,
  "basemanagerid" varchar(64) COLLATE "pg_catalog"."default" NOT NULL,
  "baseroleid" varchar(64) COLLATE "pg_catalog"."default" NOT NULL
)
;

-- ----------------------------
-- Records of base_manager_role
-- ----------------------------
INSERT INTO "public"."base_manager_role" VALUES ('0fa6e1c9bc274a6a93b5b820aae0e46d1572940270163', 'e1b0280a1d534a15bd7ce11dec44f2051572852405632', 'b8cfd7b8e9d44d2ab432431de46c300f1572852307647');
INSERT INTO "public"."base_manager_role" VALUES ('161b81fb2a8840c9ae7b735b745343aa1572851904225', '67ef53697b9641a6898324e2f71675ee1572330403444', '4028808368595df501685962c8e20000');
INSERT INTO "public"."base_manager_role" VALUES ('2c928e6e6618ff54016622daf9070007', '40288083679b5b0f01679b5b8d040000', '402867826516fc7f0165171189510001');
INSERT INTO "public"."base_manager_role" VALUES ('f9411afb16044042864824f3840123dd1572940358382', 'b1d891660f9c45f6ac9212113b3722c51572940358366', '734abf12838e4fe883ba8cd7820a3f521572940332975');

-- ----------------------------
-- Table structure for base_navigation
-- ----------------------------
DROP TABLE IF EXISTS "public"."base_navigation";
CREATE TABLE "public"."base_navigation" (
  "id" varchar(64) COLLATE "pg_catalog"."default" NOT NULL,
  "mainid" int4 NOT NULL DEFAULT nextval('t_basenavigation_mainid_seq'::regclass),
  "parentid" int4 NOT NULL,
  "navigationtype" varchar(256) COLLATE "pg_catalog"."default" NOT NULL,
  "navigationname" varchar(256) COLLATE "pg_catalog"."default" NOT NULL,
  "title" varchar(64) COLLATE "pg_catalog"."default" NOT NULL,
  "subtitle" varchar(64) COLLATE "pg_catalog"."default" DEFAULT NULL::character varying,
  "iconurl" varchar(128) COLLATE "pg_catalog"."default" DEFAULT NULL::character varying,
  "linkurl" varchar(128) COLLATE "pg_catalog"."default" DEFAULT NULL::character varying,
  "islock" bool NOT NULL DEFAULT true,
  "actiontype" varchar(256) COLLATE "pg_catalog"."default" NOT NULL,
  "issys" bool NOT NULL DEFAULT false,
  "addtime" timestamp(6) NOT NULL,
  "adduserid" varchar(64) COLLATE "pg_catalog"."default" NOT NULL,
  "addusername" varchar(64) COLLATE "pg_catalog"."default" NOT NULL,
  "modifytime" timestamp(6),
  "modifyuserid" varchar(64) COLLATE "pg_catalog"."default" DEFAULT NULL::character varying,
  "modifyname" varchar(64) COLLATE "pg_catalog"."default" DEFAULT NULL::character varying,
  "deletemark" bool NOT NULL DEFAULT false,
  "deletetime" timestamp(6),
  "deletename" varchar(64) COLLATE "pg_catalog"."default" DEFAULT NULL::character varying,
  "remark" varchar(512) COLLATE "pg_catalog"."default" DEFAULT NULL::character varying,
  "sortcode" int4 DEFAULT 1
)
;

-- ----------------------------
-- Records of base_navigation
-- ----------------------------
INSERT INTO "public"."base_navigation" VALUES ('28c8c1c5b000418e9cdd2cea65d8ed181572943052225', 432, 180, 'control', 'SystemLogGetBaseSystemLogByPage', '获取系统日志列表', '获取系统日志列表', NULL, '#', 'f', 'SystemLog:list:getBaseSystemLogByPage', 't', '2019-11-05 16:37:32', '40288083679b5b0f01679b5b8d040000', 'sa', '2019-11-05 16:37:32', NULL, NULL, 'f', NULL, NULL, '', 99);
INSERT INTO "public"."base_navigation" VALUES ('297e155b645d9a3701645dc68d210001', 1, 0, 'dir', 'sysManage', '系统管理', '系统管理', NULL, '#', 'f', '#', 't', '2018-07-03 09:34:10', '402883e25d597906015d597ad08a0003', 'sa', '2019-11-05 11:13:18', '40288083679b5b0f01679b5b8d040000', 'sa', 'f', NULL, NULL, '', 1);
INSERT INTO "public"."base_navigation" VALUES ('297e155b645d9a3701645dc86dc50002', 2, 1, 'page', 'adminManage', '管理员管理', '管理员管理', '', '../SystemManage/AdminManage/AdminList.html', 'f', 'BaseManager:list:getBaseManagerByPage', 't', '2018-07-03 09:36:13', '402883e25d597906015d597ad08a0003', 'sa', NULL, NULL, NULL, 'f', '2018-12-19 17:09:00', 'sa', '', 99);
INSERT INTO "public"."base_navigation" VALUES ('297ec62f5de8a6dc015de8abf6f80001', 3, 1, 'page', 'dictionary', '数据字典', '数据字典', NULL, '../SystemManage/DataDictionaryManage/DataDictionaryList.html', 'f', 'BaseItems:list:*', 't', '2017-08-16 09:32:50', '402883e25d597906015d597ad08a0003', 'sa', '2018-12-26 17:33:21', '40288083679b5b0f01679b5b8d040000', 'sa', 'f', '2018-12-19 17:08:15', 'sa', '', 99);
INSERT INTO "public"."base_navigation" VALUES ('297ec62f5dea44e3015dea4e33a80001', 4, 1, 'page', 'roleManage', '角色管理', '角色管理', NULL, '../SystemManage/RoleManage/RoleList.html', 'f', 'BaseRole:list:getBaseRoleByPage', 't', '2017-08-16 17:09:39', '402883e25d597906015d597ad08a0003', 'sa', '2018-12-24 10:13:58', '40288083679b5b0f01679b5b8d040000', 'sa', 'f', '2018-12-20 09:14:04', 'sa', '', 99);
INSERT INTO "public"."base_navigation" VALUES ('297ec62f5deeb2ce015deeba8bd50001', 5, 1, 'page', 'navManage', '导航栏管理', '导航栏管理', NULL, '../SystemManage/NavigationManage/NavigationList.html', 'f', 'BaseNavigation:list:getAllBaseNavigation', 't', '2017-08-17 13:46:29', '402883e25d597906015d597ad08a0003', 'sa', '2019-01-07 15:17:44', '40288083679b5b0f01679b5b8d040000', 'sa', 'f', NULL, NULL, '', 99);
INSERT INTO "public"."base_navigation" VALUES ('4028808267c972960167c97327380000', 17, 2, 'page', 'deleteAdmin', '删除管理员', '删除管理员', NULL, '#', 'f', 'BaseManager:delete:deleteBaseManager', 't', '2018-12-20 10:30:26', 'admin', 'admin', '2018-12-21 16:22:25', '40288083679b5b0f01679b5b8d040000', 'sa', 'f', '2018-12-20 15:21:42', 'sa', '删除管理员', 108);
INSERT INTO "public"."base_navigation" VALUES ('4028808267ca2c910167ca4964460000', 19, 2, 'control', 'viewAdmin', '查看管理员', '查看管理员', NULL, '#', 'f', 'BaseManager:view:getBaseManager', 't', '2018-12-20 14:24:26', 'admin', 'admin', '2018-12-21 16:21:40', '40288083679b5b0f01679b5b8d040000', 'sa', 'f', NULL, NULL, '查看管理员', 56);
INSERT INTO "public"."base_navigation" VALUES ('4028808267ca2c910167ca4b7a020001', 20, 2, 'control', 'addAdmin', '添加管理员', '添加管理员', NULL, '#', 'f', 'BaseManager:add:addBaseManager', 't', '2018-12-20 14:26:43', 'admin', 'admin', '2018-12-21 16:21:57', '40288083679b5b0f01679b5b8d040000', 'sa', 'f', NULL, NULL, '添加管理员操作', 78);
INSERT INTO "public"."base_navigation" VALUES ('4028808267ca2c910167ca7ee1190002', 21, 5, 'control', 'addNavigation', '添加导航栏', '添加导航栏', NULL, '#', 'f', 'BaseNavigation:add:addBaseNavigation', 't', '2018-12-20 15:22:52', 'admin', 'admin', '2018-12-21 16:23:19', '40288083679b5b0f01679b5b8d040000', 'sa', 'f', NULL, NULL, '添加导航栏操作', 61);
INSERT INTO "public"."base_navigation" VALUES ('4028808267e90dc50167e9305049001e', 33, 2, 'control', 'lockBaseManager', '是否禁用', '是否禁用', NULL, '#', 'f', 'BaseManager:update:lockBaseManager', 't', '2018-12-26 14:25:16', 'admin', 'admin', '2018-12-26 14:25:16', NULL, NULL, 'f', NULL, NULL, '', 99);
INSERT INTO "public"."base_navigation" VALUES ('4028808267e90dc50167e931757d001f', 34, 2, 'control', 'bindManagerRole', '绑定角色', '绑定角色', NULL, '#', 'f', 'BaseManager:update:updateBaseManagerRole', 't', '2018-12-26 14:26:31', 'admin', 'admin', '2018-12-26 14:26:31', NULL, NULL, 'f', NULL, NULL, '', 99);
INSERT INTO "public"."base_navigation" VALUES ('4028808267e90dc50167e935775e0020', 35, 1, 'page', 'OrganizeManage', '机构管理', '', NULL, '../SystemManage/OrganizeManage/OrganizeList.html', 'f', 'BaseOrganize:list:getBaseOrganizeListForShow', 't', '2018-12-26 14:30:54', 'admin', 'admin', '2019-01-07 15:18:46', '40288083679b5b0f01679b5b8d040000', 'sa', 'f', NULL, NULL, '', 20);
INSERT INTO "public"."base_navigation" VALUES ('4028808267e90dc50167e93c6e500021', 36, 4, 'control', 'bindNavigationRole', '绑定权限', '绑定权限', NULL, '#', 'f', 'BaseRole:update:updateBaseNavigationRole', 't', '2018-12-26 14:38:30', 'admin', 'admin', '2018-12-26 14:38:30', NULL, NULL, 'f', NULL, NULL, '', 99);
INSERT INTO "public"."base_navigation" VALUES ('402880826bb55d30016bb55f43160000', 180, 1, 'page', 'SystemLogManage', '系统日志', '', NULL, '../SystemManage/SystemLogManage/SystemLogList.html', 'f', '#', 't', '2019-07-03 09:07:27', '40288083679b5b0f01679b5b8d040000', 'sa', '2019-07-03 09:07:27', NULL, NULL, 'f', NULL, NULL, '', 100);
INSERT INTO "public"."base_navigation" VALUES ('4028808367cfd84d0167cfde3b3c0000', 22, 5, 'control', 'viewNavigation', '查看导航栏', '查看导航栏', NULL, '#', 'f', 'BaseNavigation:view:getBaseNavigation', 't', '2018-12-21 16:25:07', 'admin', 'admin', '2018-12-21 16:25:07', NULL, NULL, 'f', NULL, NULL, '', 99);
INSERT INTO "public"."base_navigation" VALUES ('4028808367cfd84d0167cfdf6fc40001', 23, 5, 'control', 'editNavigation', '编辑导航栏', '编辑导航栏', NULL, '#', 'f', 'BaseNavigation:update:updateBaseNavigation', 't', '2018-12-21 16:26:26', 'admin', 'admin', '2018-12-21 16:26:26', NULL, NULL, 'f', NULL, NULL, '', 99);
INSERT INTO "public"."base_navigation" VALUES ('4028808367cfd84d0167cfe289b40002', 24, 5, 'control', 'deleteNavigation', '删除导航栏', '删除导航栏', NULL, '#', 'f', 'BaseNavigation:delete:deleteBaseNavigation', 't', '2018-12-21 16:29:49', 'admin', 'admin', '2018-12-21 16:29:49', NULL, NULL, 'f', NULL, NULL, '', 99);
INSERT INTO "public"."base_navigation" VALUES ('4028808367cfd84d0167cff1ff960007', 29, 4, 'control', 'addBaseRole', '添加角色', '添加角色', NULL, '#', 'f', 'BaseRole:add:addBaseRole', 't', '2018-12-21 16:46:42', 'admin', 'admin', '2018-12-21 16:46:42', NULL, NULL, 'f', NULL, NULL, '', 99);
INSERT INTO "public"."base_navigation" VALUES ('4028808367cfd84d0167cff2a0380008', 30, 4, 'control', 'viewBaseRole', '查看角色', '查看角色', NULL, '#', 'f', 'BaseRole:view:getBaseRole', 't', '2018-12-21 16:47:23', 'admin', 'admin', '2018-12-21 16:47:33', '40288083679b5b0f01679b5b8d040000', 'sa', 'f', NULL, NULL, '', 99);
INSERT INTO "public"."base_navigation" VALUES ('4028808367cfd84d0167cff3ee290009', 31, 4, 'control', 'editBaseRole', '编辑角色', '编辑角色', NULL, '#', 'f', 'BaseRole:update:updateBaseRole', 't', '2018-12-21 16:48:49', 'admin', 'admin', '2018-12-21 16:48:49', NULL, NULL, 'f', NULL, NULL, '', 99);
INSERT INTO "public"."base_navigation" VALUES ('4028808367cfd84d0167cff5c47b000a', 32, 4, 'control', 'deleteBaseRole', '删除角色', '删除角色', NULL, '#', 'f', 'BaseRole:delete:deleteBaseRole', 't', '2018-12-21 16:50:49', 'admin', 'admin', '2018-12-21 16:50:49', NULL, NULL, 'f', NULL, NULL, '', 99);
INSERT INTO "public"."base_navigation" VALUES ('4028808367e9d6d30167e9d8f87d0000', 37, 3, 'control', 'addBaseBaseItems', '添加字典', '添加字典', NULL, '#', 'f', 'BaseItems:add:addBaseBaseItems', 't', '2018-12-26 17:29:29', 'admin', 'admin', '2018-12-26 17:29:29', NULL, NULL, 'f', NULL, NULL, '', 99);
INSERT INTO "public"."base_navigation" VALUES ('4028808367e9d6d30167e9db291c0001', 38, 3, 'control', 'viewBaseItems', '查看字典', '查看字典', NULL, '#', 'f', 'BaseItems:view:*', 't', '2018-12-26 17:31:53', 'admin', 'admin', '2018-12-26 17:31:53', NULL, NULL, 'f', NULL, NULL, '', 99);
INSERT INTO "public"."base_navigation" VALUES ('4028808367e9d6d30167e9dd48710002', 39, 3, 'control', 'editSingleBaseItems', '编辑字典', '编辑字典', NULL, '#', 'f', 'BaseItems:update:editSingleBaseItems', 't', '2018-12-26 17:34:12', 'admin', 'admin', '2018-12-26 17:34:12', NULL, NULL, 'f', NULL, NULL, '', 99);
INSERT INTO "public"."base_navigation" VALUES ('4028808367e9d6d30167e9ddf27c0003', 40, 3, 'control', 'deleteSingleBaseItems', '删除字典', '删除字典', NULL, '#', 'f', 'BaseItems:delete:deleteSingleBaseItems', 't', '2018-12-26 17:34:56', 'admin', 'admin', '2018-12-26 17:34:56', NULL, NULL, 'f', NULL, NULL, '', 99);
INSERT INTO "public"."base_navigation" VALUES ('4028808367e9d6d30167e9debaee0004', 41, 3, 'control', 'addBaseItemsDetail', '添加字典详情', '添加字典详情', NULL, '#', 'f', 'BaseItemsDetail:add:addBaseItemsDetail', 't', '2018-12-26 17:35:47', 'admin', 'admin', '2018-12-26 17:36:06', '40288083679b5b0f01679b5b8d040000', 'sa', 'f', NULL, NULL, '', 99);
INSERT INTO "public"."base_navigation" VALUES ('4028808367e9d6d30167e9e004790005', 42, 3, 'control', 'viewSingleBaseItemsDetailForEdit', '查看字典详情', '查看字典详情', NULL, '#', 'f', 'BaseItemsDetail:view:getSingleBaseItemsDetailForEdit', 't', '2018-12-26 17:37:11', 'admin', 'admin', '2018-12-26 17:37:11', NULL, NULL, 'f', NULL, NULL, '', 99);
INSERT INTO "public"."base_navigation" VALUES ('4028808367e9d6d30167e9e08ac40006', 43, 3, 'control', 'editSingleBaseItemsDetail', '修改字典详情', '修改字典详情', NULL, '#', 'f', 'BaseItemsDetail:update:editSingleBaseItemsDetail', 't', '2018-12-26 17:37:46', 'admin', 'admin', '2018-12-26 17:37:46', NULL, NULL, 'f', NULL, NULL, '', 99);
INSERT INTO "public"."base_navigation" VALUES ('4028808367e9d6d30167e9e13ea10007', 44, 3, 'control', 'deleteSingleBaseItemsDetail', '删除字典详情', '删除字典详情', NULL, '#', 'f', 'BaseItemsDetail:delete:deleteSingleBaseItemsDetail', 't', '2018-12-26 17:38:32', 'admin', 'admin', '2018-12-26 17:38:32', NULL, NULL, 'f', NULL, NULL, '', 99);
INSERT INTO "public"."base_navigation" VALUES ('4028808367e9d6d30167e9e26d250008', 45, 3, 'control', 'getBaseItemsDetailListForShow', '获取字典详情列表', '获取字典详情列表', NULL, '#', 'f', 'BaseItemsDetail:list:getBaseItemsDetailListForShow', 't', '2018-12-26 17:39:49', 'admin', 'admin', '2018-12-26 17:39:49', NULL, NULL, 'f', NULL, NULL, '', 99);
INSERT INTO "public"."base_navigation" VALUES ('40288083682b47ab01682b5069f70005', 47, 35, 'control', 'addBaseOrganize', '添加组织机构', '添加组织机构', NULL, '#', 'f', 'BaseOrganize:add:addBaseOrganize', 't', '2019-01-08 10:35:16', 'admin', 'admin', '2019-01-08 10:35:16', NULL, NULL, 'f', NULL, NULL, '', 99);
INSERT INTO "public"."base_navigation" VALUES ('40288083682b47ab01682b51b91e0006', 48, 35, 'control', 'getSingleBaseOrganizeForEdit', '查看组织机构', '查看组织机构', NULL, '#', 'f', 'BaseOrganize:view:getSingleBaseOrganizeForEdit', 't', '2019-01-08 10:36:42', 'admin', 'admin', '2019-01-08 10:36:42', NULL, NULL, 'f', NULL, NULL, '', 99);
INSERT INTO "public"."base_navigation" VALUES ('40288083682b47ab01682b525a090007', 49, 35, 'control', 'editBaseOrganize', '修改组织机构', '修改组织机构', NULL, '#', 'f', 'BaseOrganize:update:editBaseOrganize', 't', '2019-01-08 10:37:23', 'admin', 'admin', '2019-01-08 10:37:23', NULL, NULL, 'f', NULL, NULL, '', 99);
INSERT INTO "public"."base_navigation" VALUES ('40288083682b47ab01682b52fe670008', 50, 35, 'control', 'deleteSingleBaseOrganize', '删除组织机构', '删除组织机构', NULL, '#', 'f', 'BaseOrganize:delete:deleteSingleBaseOrganize', 't', '2019-01-08 10:38:05', 'admin', 'admin', '2019-01-08 10:38:05', NULL, NULL, 'f', NULL, NULL, '', 99);
INSERT INTO "public"."base_navigation" VALUES ('ff80808167c976b70167c978c76a0000', 18, 2, 'control', 'editAdmin', '编辑管理员', '编辑管理员', NULL, '#', 'f', 'BaseManager:update:updateBaseManager', 't', '2018-12-20 10:36:35', 'admin', 'admin', '2018-12-24 10:59:02', '40288083679b5b0f01679b5b8d040000', 'sa', 'f', '2018-12-20 11:53:14', 'sa', '你好代缴费', 12);
INSERT INTO "public"."base_navigation" VALUES ('18a6fc079c90448e9faa900490cf3c5a1575251773154', 439, 437, 'page', 'SelfWorkerManage', '自有人员管理', '', NULL, '../BaseManage/SelfWorkerManage/SelfWorkerList.html', 'f', '#', 't', '2019-12-02 09:56:13', '40288083679b5b0f01679b5b8d040000', 'sa', '2019-12-02 10:04:25', '40288083679b5b0f01679b5b8d040000', 'sa', 't', '2019-12-11 12:06:38', 'sa', '', 30);
INSERT INTO "public"."base_navigation" VALUES ('53ab663268dc454ea97933465a02b04d1575256697017', 440, 437, 'page', 'DelegateCompanyManage', '外包公司管理', '', NULL, '../BaseManage/DelegateCompanyManage/DelegateCompanyList.html', 'f', '#', 't', '2019-12-02 11:18:17', '40288083679b5b0f01679b5b8d040000', 'sa', '2019-12-02 11:18:32', '40288083679b5b0f01679b5b8d040000', 'sa', 't', '2019-12-11 12:06:38', 'sa', '', 20);
INSERT INTO "public"."base_navigation" VALUES ('65bd3375491b4096a8b5ee05a56b86561575249256514', 438, 437, 'page', 'CustomerManage', '客户管理', '', NULL, '../BaseManage/CustomerManage/CustomerList.html', 'f', '#', 't', '2019-12-02 09:14:16', '40288083679b5b0f01679b5b8d040000', 'sa', '2019-12-02 09:14:55', '40288083679b5b0f01679b5b8d040000', 'sa', 't', '2019-12-11 12:06:38', 'sa', '', 40);
INSERT INTO "public"."base_navigation" VALUES ('6cbed4bc6a124ebfa46cb17024d322dd1575249124065', 437, 0, 'dir', 'BaseManage', '基础管理', '', NULL, '#', 'f', '#', 't', '2019-12-02 09:12:04', '40288083679b5b0f01679b5b8d040000', 'sa', '2019-12-02 09:12:04', NULL, NULL, 't', '2019-12-11 12:06:38', 'sa', '', 20);

-- ----------------------------
-- Table structure for base_navigation_role
-- ----------------------------
DROP TABLE IF EXISTS "public"."base_navigation_role";
CREATE TABLE "public"."base_navigation_role" (
  "id" varchar(64) COLLATE "pg_catalog"."default" NOT NULL,
  "basenavigationid" varchar(64) COLLATE "pg_catalog"."default" NOT NULL,
  "baseroleid" varchar(64) COLLATE "pg_catalog"."default" NOT NULL
)
;

-- ----------------------------
-- Records of base_navigation_role
-- ----------------------------
INSERT INTO "public"."base_navigation_role" VALUES ('0029e08e735a4606bcf8cba5ac1de0031572924126022', '4028808367e9d6d30167e9e13ea10007', '4028808368595df501685962c8e20000');
INSERT INTO "public"."base_navigation_role" VALUES ('00b1e0c9e5064253ae42f9038c7665d31572943074850', '4028808367e9d6d30167e9debaee0004', '734abf12838e4fe883ba8cd7820a3f521572940332975');
INSERT INTO "public"."base_navigation_role" VALUES ('01a99d98f3cd4d299bd3e1c036d91ce81573201267498', '4028808267c972960167c97327380000', 'b8cfd7b8e9d44d2ab432431de46c300f1572852307647');
INSERT INTO "public"."base_navigation_role" VALUES ('068fd8ed0e9e47619632db88dab9821a1572924126100', '402880826bb55d30016bb55f43160000', '4028808368595df501685962c8e20000');
INSERT INTO "public"."base_navigation_role" VALUES ('06b10d2c7dab4176a73ac47f495c6e5b1572924125991', '297ec62f5de8a6dc015de8abf6f80001', '4028808368595df501685962c8e20000');
INSERT INTO "public"."base_navigation_role" VALUES ('095a0e11457e4e77968dde5d83bce38d1573201267498', '402880826bb55d30016bb55f43160000', 'b8cfd7b8e9d44d2ab432431de46c300f1572852307647');
INSERT INTO "public"."base_navigation_role" VALUES ('0c2b1a422834499a93c9bde3b18f42311572943074960', '4028808267ca2c910167ca4964460000', '734abf12838e4fe883ba8cd7820a3f521572940332975');
INSERT INTO "public"."base_navigation_role" VALUES ('14fc176976a94d09a03867e42267c5971572943074897', '4028808367cfd84d0167cff2a0380008', '734abf12838e4fe883ba8cd7820a3f521572940332975');
INSERT INTO "public"."base_navigation_role" VALUES ('151d368392694dd383eb62ce912873861573201267389', '4028808367e9d6d30167e9e13ea10007', 'b8cfd7b8e9d44d2ab432431de46c300f1572852307647');
INSERT INTO "public"."base_navigation_role" VALUES ('15c7e0f5b9b6442ba57db0d2218bc8911572943074788', '40288083682b47ab01682b525a090007', '734abf12838e4fe883ba8cd7820a3f521572940332975');
INSERT INTO "public"."base_navigation_role" VALUES ('16201879109444c997df7a107fc8b0cb1572924126038', '4028808367cfd84d0167cff2a0380008', '4028808368595df501685962c8e20000');
INSERT INTO "public"."base_navigation_role" VALUES ('16ad5d3872e64352b45e3667540870141573201267483', '4028808267ca2c910167ca4964460000', 'b8cfd7b8e9d44d2ab432431de46c300f1572852307647');
INSERT INTO "public"."base_navigation_role" VALUES ('1b780818a0ce4442b49b7ef1c7277a141572943074882', '297ec62f5dea44e3015dea4e33a80001', '734abf12838e4fe883ba8cd7820a3f521572940332975');
INSERT INTO "public"."base_navigation_role" VALUES ('1bb59d80fc7c41818b039838c2588b081572943074944', '4028808367cfd84d0167cfdf6fc40001', '734abf12838e4fe883ba8cd7820a3f521572940332975');
INSERT INTO "public"."base_navigation_role" VALUES ('1da33fe33c5f4aaca3ebe5bb5f3ebb711572924126085', '4028808267ca2c910167ca4964460000', '4028808368595df501685962c8e20000');
INSERT INTO "public"."base_navigation_role" VALUES ('1e51bb1b90964156806e67446fb4593f1573201267467', 'ff80808167c976b70167c978c76a0000', 'b8cfd7b8e9d44d2ab432431de46c300f1572852307647');
INSERT INTO "public"."base_navigation_role" VALUES ('1ee4f51268834e45824aa7f10d63900b1573201267327', '40288083682b47ab01682b51b91e0006', 'b8cfd7b8e9d44d2ab432431de46c300f1572852307647');
INSERT INTO "public"."base_navigation_role" VALUES ('1fe591f0d01147b986597adb3ce3634d1572943074928', '4028808367cfd84d0167cfde3b3c0000', '734abf12838e4fe883ba8cd7820a3f521572940332975');
INSERT INTO "public"."base_navigation_role" VALUES ('215cd9cdd3494c0c9bed851d577214701573201267436', '4028808267e90dc50167e93c6e500021', 'b8cfd7b8e9d44d2ab432431de46c300f1572852307647');
INSERT INTO "public"."base_navigation_role" VALUES ('2449785dd9d24595861fc1b0a99201521572924126069', '4028808367cfd84d0167cfe289b40002', '4028808368595df501685962c8e20000');
INSERT INTO "public"."base_navigation_role" VALUES ('253d338c0f354a58ae736fe518bc22a41572924126053', '297ec62f5deeb2ce015deeba8bd50001', '4028808368595df501685962c8e20000');
INSERT INTO "public"."base_navigation_role" VALUES ('2599bcae042d41d0bf193170999c11b31573201267405', '4028808367cfd84d0167cff2a0380008', 'b8cfd7b8e9d44d2ab432431de46c300f1572852307647');
INSERT INTO "public"."base_navigation_role" VALUES ('26e72fd3654245dfa53aec6a66f83f581572924126085', '4028808267ca2c910167ca4b7a020001', '4028808368595df501685962c8e20000');
INSERT INTO "public"."base_navigation_role" VALUES ('28f7672b72674164ac9c5870b99719391573201267342', '40288083682b47ab01682b525a090007', 'b8cfd7b8e9d44d2ab432431de46c300f1572852307647');
INSERT INTO "public"."base_navigation_role" VALUES ('2a59801956d74aca9711c419407418d01572924126053', '4028808267e90dc50167e93c6e500021', '4028808368595df501685962c8e20000');
INSERT INTO "public"."base_navigation_role" VALUES ('2be435562a594de3b48ef276c2f74fa01573201267452', '4028808367cfd84d0167cfde3b3c0000', 'b8cfd7b8e9d44d2ab432431de46c300f1572852307647');
INSERT INTO "public"."base_navigation_role" VALUES ('304d99c17ce54deb9ec860c90782a6251573201267358', '4028808367e9d6d30167e9dd48710002', 'b8cfd7b8e9d44d2ab432431de46c300f1572852307647');
INSERT INTO "public"."base_navigation_role" VALUES ('3249444103a743ea8ea07794869e36b91572943074803', '297ec62f5de8a6dc015de8abf6f80001', '734abf12838e4fe883ba8cd7820a3f521572940332975');
INSERT INTO "public"."base_navigation_role" VALUES ('341d5aca853c4a649828bc806d973d421572924126022', '4028808367e9d6d30167e9e08ac40006', '4028808368595df501685962c8e20000');
INSERT INTO "public"."base_navigation_role" VALUES ('346323eb966a4ecfb2a9aa20fd511f4e1572924126007', '4028808367e9d6d30167e9db291c0001', '4028808368595df501685962c8e20000');
INSERT INTO "public"."base_navigation_role" VALUES ('3829faa1785a46618a06cc20fa9f11b31572924125991', '4028808367e9d6d30167e9d8f87d0000', '4028808368595df501685962c8e20000');
INSERT INTO "public"."base_navigation_role" VALUES ('3920bb7838944c869e9a3fb653cdc70a1573201267467', '4028808367cfd84d0167cfe289b40002', 'b8cfd7b8e9d44d2ab432431de46c300f1572852307647');
INSERT INTO "public"."base_navigation_role" VALUES ('399063b546e74c8db4c3aa615373dfaa1572943074960', '4028808267ca2c910167ca4b7a020001', '734abf12838e4fe883ba8cd7820a3f521572940332975');
INSERT INTO "public"."base_navigation_role" VALUES ('3fa8ff866c7a48849a2df4489c068e911573201267405', '4028808367cfd84d0167cff1ff960007', 'b8cfd7b8e9d44d2ab432431de46c300f1572852307647');
INSERT INTO "public"."base_navigation_role" VALUES ('44d25c3ae8194b63b7f546c0214afcfa1573201267327', '40288083682b47ab01682b5069f70005', 'b8cfd7b8e9d44d2ab432431de46c300f1572852307647');
INSERT INTO "public"."base_navigation_role" VALUES ('4dd0554410e64a8ea4c9e1b6accb355b1573201267358', '4028808367e9d6d30167e9d8f87d0000', 'b8cfd7b8e9d44d2ab432431de46c300f1572852307647');
INSERT INTO "public"."base_navigation_role" VALUES ('4eea9c17e0d741ef88475618105a10221572943074991', '402880826bb55d30016bb55f43160000', '734abf12838e4fe883ba8cd7820a3f521572940332975');
INSERT INTO "public"."base_navigation_role" VALUES ('4f69c33957d04c6aa4a7b302fafd76501573201267342', '40288083682b47ab01682b52fe670008', 'b8cfd7b8e9d44d2ab432431de46c300f1572852307647');
INSERT INTO "public"."base_navigation_role" VALUES ('503da2d46be54c8bbd90af5a7604d1991572943074788', '40288083682b47ab01682b5069f70005', '734abf12838e4fe883ba8cd7820a3f521572940332975');
INSERT INTO "public"."base_navigation_role" VALUES ('5105289e4d7d432193cffc7236bee2821572943074882', '4028808367e9d6d30167e9e26d250008', '734abf12838e4fe883ba8cd7820a3f521572940332975');
INSERT INTO "public"."base_navigation_role" VALUES ('5162544521a3436b84da168b1cd6bdbb1572924126069', '4028808367cfd84d0167cfde3b3c0000', '4028808368595df501685962c8e20000');
INSERT INTO "public"."base_navigation_role" VALUES ('561b3aae2bef47d6a9c8fc72c69131a51572924126085', 'ff80808167c976b70167c978c76a0000', '4028808368595df501685962c8e20000');
INSERT INTO "public"."base_navigation_role" VALUES ('567bb5a5df6d493a8cc8cd82d4d6f4801573201267452', '4028808367cfd84d0167cfdf6fc40001', 'b8cfd7b8e9d44d2ab432431de46c300f1572852307647');
INSERT INTO "public"."base_navigation_role" VALUES ('638ef7d2f3f2490e9b5f6d32ebbf69621572943074803', '40288083682b47ab01682b52fe670008', '734abf12838e4fe883ba8cd7820a3f521572940332975');
INSERT INTO "public"."base_navigation_role" VALUES ('65dd0bfcab9b4065aa37a938116a207e1572943074897', '4028808367cfd84d0167cff1ff960007', '734abf12838e4fe883ba8cd7820a3f521572940332975');
INSERT INTO "public"."base_navigation_role" VALUES ('66350fec9c614f52bd3886994f851c801573201267342', '297ec62f5de8a6dc015de8abf6f80001', 'b8cfd7b8e9d44d2ab432431de46c300f1572852307647');
INSERT INTO "public"."base_navigation_role" VALUES ('676ec34c92be4f2695de30195ea931721573201267373', '4028808367e9d6d30167e9debaee0004', 'b8cfd7b8e9d44d2ab432431de46c300f1572852307647');
INSERT INTO "public"."base_navigation_role" VALUES ('6b16e86c163f4e8687bd3e255a964da31572924125991', '40288083682b47ab01682b525a090007', '4028808368595df501685962c8e20000');
INSERT INTO "public"."base_navigation_role" VALUES ('6c1a743421ee47dc80fdc1526d20637a1573201267389', '4028808367e9d6d30167e9e08ac40006', 'b8cfd7b8e9d44d2ab432431de46c300f1572852307647');
INSERT INTO "public"."base_navigation_role" VALUES ('719979d873104225b55cc9d18bfdc3b81573201267311', '297e155b645d9a3701645dc68d210001', 'b8cfd7b8e9d44d2ab432431de46c300f1572852307647');
INSERT INTO "public"."base_navigation_role" VALUES ('757115d34c054fa3a41a9a73f6c301751572924126038', '297ec62f5dea44e3015dea4e33a80001', '4028808368595df501685962c8e20000');
INSERT INTO "public"."base_navigation_role" VALUES ('76bd2c34e23a4ede83967253fabe19681572924126069', '4028808267ca2c910167ca7ee1190002', '4028808368595df501685962c8e20000');
INSERT INTO "public"."base_navigation_role" VALUES ('7adafab679c949f1899fdfc7d18863151572924126038', '4028808367cfd84d0167cff1ff960007', '4028808368595df501685962c8e20000');
INSERT INTO "public"."base_navigation_role" VALUES ('7e90c697158f477a9ded95d7f89c7b261572943074835', '4028808367e9d6d30167e9d8f87d0000', '734abf12838e4fe883ba8cd7820a3f521572940332975');
INSERT INTO "public"."base_navigation_role" VALUES ('8396c70ed92f430ea4ff0097fc4ae6821572924126007', '4028808367e9d6d30167e9dd48710002', '4028808368595df501685962c8e20000');
INSERT INTO "public"."base_navigation_role" VALUES ('84ee90ab08994d52b306e8cf6904d8e31572943074866', '4028808367e9d6d30167e9e13ea10007', '734abf12838e4fe883ba8cd7820a3f521572940332975');
INSERT INTO "public"."base_navigation_role" VALUES ('8e099d8fdbad4f0bb52b0fc9214917801572924125960', '297e155b645d9a3701645dc68d210001', '4028808368595df501685962c8e20000');
INSERT INTO "public"."base_navigation_role" VALUES ('91c3ea82188b4b47b343ee6ade6a407e1572943074944', '4028808367cfd84d0167cfe289b40002', '734abf12838e4fe883ba8cd7820a3f521572940332975');
INSERT INTO "public"."base_navigation_role" VALUES ('955c27c716cd4845a32f9482fc4227131573201267498', '4028808267e90dc50167e931757d001f', 'b8cfd7b8e9d44d2ab432431de46c300f1572852307647');
INSERT INTO "public"."base_navigation_role" VALUES ('96ac14e0803b47b9ab56356b7037da891572943074866', '4028808367e9d6d30167e9e004790005', '734abf12838e4fe883ba8cd7820a3f521572940332975');
INSERT INTO "public"."base_navigation_role" VALUES ('9d98286dcb70499e84338d3c627b9fa61573201267358', '4028808367e9d6d30167e9db291c0001', 'b8cfd7b8e9d44d2ab432431de46c300f1572852307647');
INSERT INTO "public"."base_navigation_role" VALUES ('9e2178f633c64022ad9a3f28c4ef6fa71572943074866', '4028808367e9d6d30167e9e08ac40006', '734abf12838e4fe883ba8cd7820a3f521572940332975');
INSERT INTO "public"."base_navigation_role" VALUES ('9f2d83ae8f35478e91ac20331e56a1761573201267405', '297ec62f5dea44e3015dea4e33a80001', 'b8cfd7b8e9d44d2ab432431de46c300f1572852307647');
INSERT INTO "public"."base_navigation_role" VALUES ('a17cb1b1cb31477fbe756d56327a9f481572924125975', '40288083682b47ab01682b5069f70005', '4028808368595df501685962c8e20000');
INSERT INTO "public"."base_navigation_role" VALUES ('a213beb291654b02a5043f05e35a581f1572943074960', 'ff80808167c976b70167c978c76a0000', '734abf12838e4fe883ba8cd7820a3f521572940332975');
INSERT INTO "public"."base_navigation_role" VALUES ('a2c8cdce3afe4f5dbd1cba1a189c8fa81572943074913', '297ec62f5deeb2ce015deeba8bd50001', '734abf12838e4fe883ba8cd7820a3f521572940332975');
INSERT INTO "public"."base_navigation_role" VALUES ('a5009e1f4a9b4bb8834668529b3e829a1572943074928', '4028808267ca2c910167ca7ee1190002', '734abf12838e4fe883ba8cd7820a3f521572940332975');
INSERT INTO "public"."base_navigation_role" VALUES ('a5e395fbc1c941b494d358ae7ddc9caa1572943074772', '297e155b645d9a3701645dc68d210001', '734abf12838e4fe883ba8cd7820a3f521572940332975');
INSERT INTO "public"."base_navigation_role" VALUES ('a685097a5a384320b619a0657e2083261572924126007', '4028808367e9d6d30167e9debaee0004', '4028808368595df501685962c8e20000');
INSERT INTO "public"."base_navigation_role" VALUES ('a86f77e8e0d74ca2ad9daa96a4609c8f1573201267498', '28c8c1c5b000418e9cdd2cea65d8ed181572943052225', 'b8cfd7b8e9d44d2ab432431de46c300f1572852307647');
INSERT INTO "public"."base_navigation_role" VALUES ('ad406ea91e464db5a53eef71aa4d2de21572943074975', '4028808267c972960167c97327380000', '734abf12838e4fe883ba8cd7820a3f521572940332975');
INSERT INTO "public"."base_navigation_role" VALUES ('aeb6cfa65c2f4482b37269d346491f591572943074772', '4028808267e90dc50167e935775e0020', '734abf12838e4fe883ba8cd7820a3f521572940332975');
INSERT INTO "public"."base_navigation_role" VALUES ('aeb7b18730ec4624812f2fa68ee461411573201267389', '4028808367e9d6d30167e9e004790005', 'b8cfd7b8e9d44d2ab432431de46c300f1572852307647');
INSERT INTO "public"."base_navigation_role" VALUES ('b1b9d8e3bcfc4080b7983d0ea802065b1572943074897', '4028808367cfd84d0167cff3ee290009', '734abf12838e4fe883ba8cd7820a3f521572940332975');
INSERT INTO "public"."base_navigation_role" VALUES ('b3bb49d8b0304dfc946c51077de173141572943074913', '4028808267e90dc50167e93c6e500021', '734abf12838e4fe883ba8cd7820a3f521572940332975');
INSERT INTO "public"."base_navigation_role" VALUES ('b466106a0c59416d8483d5af8c2de2341573201267420', '4028808367cfd84d0167cff3ee290009', 'b8cfd7b8e9d44d2ab432431de46c300f1572852307647');
INSERT INTO "public"."base_navigation_role" VALUES ('b57e7026a5034177b6ad3c3518d02aa71573201267405', '4028808367e9d6d30167e9e26d250008', 'b8cfd7b8e9d44d2ab432431de46c300f1572852307647');
INSERT INTO "public"."base_navigation_role" VALUES ('b844df2d07fd4df79bc3125848a044141572924126053', '4028808367cfd84d0167cff5c47b000a', '4028808368595df501685962c8e20000');
INSERT INTO "public"."base_navigation_role" VALUES ('b8d116e331f643d49f4f04c8bb1e17d71572924125975', '4028808267e90dc50167e935775e0020', '4028808368595df501685962c8e20000');
INSERT INTO "public"."base_navigation_role" VALUES ('bd43e4dd0e1845509680584b886fdcd81572943074788', '40288083682b47ab01682b51b91e0006', '734abf12838e4fe883ba8cd7820a3f521572940332975');
INSERT INTO "public"."base_navigation_role" VALUES ('bd48d0c5dbaf4284956d3803bb08367c1572943074975', '4028808267e90dc50167e931757d001f', '734abf12838e4fe883ba8cd7820a3f521572940332975');
INSERT INTO "public"."base_navigation_role" VALUES ('be5ec34611b641c0a67e7737cec26a3d1573201267420', '4028808367cfd84d0167cff5c47b000a', 'b8cfd7b8e9d44d2ab432431de46c300f1572852307647');
INSERT INTO "public"."base_navigation_role" VALUES ('bef948f611c445b48759c2a94151f7801572943074975', '4028808267e90dc50167e9305049001e', '734abf12838e4fe883ba8cd7820a3f521572940332975');
INSERT INTO "public"."base_navigation_role" VALUES ('c0c0176698ac4bc1a3c8b57397dfae6a1572924126069', '4028808367cfd84d0167cfdf6fc40001', '4028808368595df501685962c8e20000');
INSERT INTO "public"."base_navigation_role" VALUES ('c12efda3b2f24675941267a21edfaa181573201267483', '4028808267ca2c910167ca4b7a020001', 'b8cfd7b8e9d44d2ab432431de46c300f1572852307647');
INSERT INTO "public"."base_navigation_role" VALUES ('c1e50cde0be747b0aa2830cee2f4bea01572924126022', '4028808367e9d6d30167e9e004790005', '4028808368595df501685962c8e20000');
INSERT INTO "public"."base_navigation_role" VALUES ('c235eb6d4199491a83d5320596317d7f1573201267327', '4028808267e90dc50167e935775e0020', 'b8cfd7b8e9d44d2ab432431de46c300f1572852307647');
INSERT INTO "public"."base_navigation_role" VALUES ('c2b3286ae2844de19bdce39dc26f922c1572924126022', '4028808367e9d6d30167e9e26d250008', '4028808368595df501685962c8e20000');
INSERT INTO "public"."base_navigation_role" VALUES ('c2b3e90e63494a94bd20593a5e73a41c1573201267436', '297ec62f5deeb2ce015deeba8bd50001', 'b8cfd7b8e9d44d2ab432431de46c300f1572852307647');
INSERT INTO "public"."base_navigation_role" VALUES ('c39a91fe6ac248f982ad5f9587dd4f901573201267452', '4028808267ca2c910167ca7ee1190002', 'b8cfd7b8e9d44d2ab432431de46c300f1572852307647');
INSERT INTO "public"."base_navigation_role" VALUES ('c3dc535f2c234376a161fa0ecc7516b81572924125975', '40288083682b47ab01682b51b91e0006', '4028808368595df501685962c8e20000');
INSERT INTO "public"."base_navigation_role" VALUES ('c4d3038dd0f04213a7c1aed67519ada01572943074913', '4028808367cfd84d0167cff5c47b000a', '734abf12838e4fe883ba8cd7820a3f521572940332975');
INSERT INTO "public"."base_navigation_role" VALUES ('c5684cf4e03749939be5bd05f0eb23751572924126085', '297e155b645d9a3701645dc86dc50002', '4028808368595df501685962c8e20000');
INSERT INTO "public"."base_navigation_role" VALUES ('ccb2865695ad45e19144040d8dcf36191572924126100', '4028808267e90dc50167e931757d001f', '4028808368595df501685962c8e20000');
INSERT INTO "public"."base_navigation_role" VALUES ('d0482497e3a54098b102fd21b9fff7cd1573201267483', '4028808267e90dc50167e9305049001e', 'b8cfd7b8e9d44d2ab432431de46c300f1572852307647');
INSERT INTO "public"."base_navigation_role" VALUES ('d4174eb6a82d4b64b2eadc035493eb2a1572943074850', '4028808367e9d6d30167e9ddf27c0003', '734abf12838e4fe883ba8cd7820a3f521572940332975');
INSERT INTO "public"."base_navigation_role" VALUES ('dad864c119df4bd38919d23a99c4cb391573201267467', '297e155b645d9a3701645dc86dc50002', 'b8cfd7b8e9d44d2ab432431de46c300f1572852307647');
INSERT INTO "public"."base_navigation_role" VALUES ('ddc33b3e89634209b5e5a43a0849e6bf1572943074991', '28c8c1c5b000418e9cdd2cea65d8ed181572943052225', '734abf12838e4fe883ba8cd7820a3f521572940332975');
INSERT INTO "public"."base_navigation_role" VALUES ('e2d46ce60a6d4e5587daad6e1599777b1572943074850', '4028808367e9d6d30167e9dd48710002', '734abf12838e4fe883ba8cd7820a3f521572940332975');
INSERT INTO "public"."base_navigation_role" VALUES ('e531adaaa1794a14ac0ac9b30883307a1573201267373', '4028808367e9d6d30167e9ddf27c0003', 'b8cfd7b8e9d44d2ab432431de46c300f1572852307647');
INSERT INTO "public"."base_navigation_role" VALUES ('e67ee6aff57d4204a3cd5e55515fa96b1572924125991', '40288083682b47ab01682b52fe670008', '4028808368595df501685962c8e20000');
INSERT INTO "public"."base_navigation_role" VALUES ('e6ca805194c24fec9e5efa597ca849341572943074944', '297e155b645d9a3701645dc86dc50002', '734abf12838e4fe883ba8cd7820a3f521572940332975');
INSERT INTO "public"."base_navigation_role" VALUES ('ea355e4ce41d4d8799220aa091fb1fca1572924126100', '4028808267c972960167c97327380000', '4028808368595df501685962c8e20000');
INSERT INTO "public"."base_navigation_role" VALUES ('f1bcd99ead2549629f56fe227d11386b1572943074835', '4028808367e9d6d30167e9db291c0001', '734abf12838e4fe883ba8cd7820a3f521572940332975');
INSERT INTO "public"."base_navigation_role" VALUES ('f4fbed9a54d249f0a66f0d65a607846f1572924126053', '4028808367cfd84d0167cff3ee290009', '4028808368595df501685962c8e20000');
INSERT INTO "public"."base_navigation_role" VALUES ('f51309b5eb3949d4aeba95782d57ca481572924126007', '4028808367e9d6d30167e9ddf27c0003', '4028808368595df501685962c8e20000');
INSERT INTO "public"."base_navigation_role" VALUES ('f9b1c64f7239417584f75ccd861460e71572924126100', '4028808267e90dc50167e9305049001e', '4028808368595df501685962c8e20000');

-- ----------------------------
-- Table structure for base_organize
-- ----------------------------
DROP TABLE IF EXISTS "public"."base_organize";
CREATE TABLE "public"."base_organize" (
  "id" varchar(64) COLLATE "pg_catalog"."default" NOT NULL,
  "mainid" int4 NOT NULL DEFAULT nextval('t_baseorganize_mainid_seq'::regclass),
  "parentid" int4 NOT NULL,
  "organizename" varchar(64) COLLATE "pg_catalog"."default" NOT NULL,
  "organizeencode" varchar(64) COLLATE "pg_catalog"."default" NOT NULL,
  "name" varchar(64) COLLATE "pg_catalog"."default" DEFAULT NULL::character varying,
  "mobilephone" varchar(64) COLLATE "pg_catalog"."default" DEFAULT NULL::character varying,
  "wechat" varchar(64) COLLATE "pg_catalog"."default" DEFAULT NULL::character varying,
  "telephone" varchar(64) COLLATE "pg_catalog"."default" DEFAULT NULL::character varying,
  "email" varchar(64) COLLATE "pg_catalog"."default" DEFAULT NULL::character varying,
  "fax" varchar(64) COLLATE "pg_catalog"."default" DEFAULT NULL::character varying,
  "address" varchar(128) COLLATE "pg_catalog"."default" DEFAULT NULL::character varying,
  "addtime" timestamp(6) NOT NULL,
  "adduserid" varchar(64) COLLATE "pg_catalog"."default" NOT NULL,
  "addusername" varchar(64) COLLATE "pg_catalog"."default" NOT NULL,
  "modifytime" timestamp(6),
  "modifyuserid" varchar(64) COLLATE "pg_catalog"."default" DEFAULT NULL::character varying,
  "modifyname" varchar(64) COLLATE "pg_catalog"."default" DEFAULT NULL::character varying,
  "deletename" varchar(64) COLLATE "pg_catalog"."default" DEFAULT NULL::character varying,
  "deletemark" bool NOT NULL DEFAULT false,
  "deletetime" timestamp(6),
  "remark" varchar(512) COLLATE "pg_catalog"."default" DEFAULT NULL::character varying,
  "sortcode" int4 DEFAULT 1
)
;

-- ----------------------------
-- Records of base_organize
-- ----------------------------
INSERT INTO "public"."base_organize" VALUES ('7bdc90650bb047b8b11ec29f9f0c9a401573552703716', 18, 17, 'test1', 'test2', '', '', '', '', '', '', '', '2019-11-12 17:58:23', '40288083679b5b0f01679b5b8d040000', 'sa', '2019-11-12 17:58:23', NULL, NULL, 'sa', 't', '2019-11-12 17:58:55', '', 2);
INSERT INTO "public"."base_organize" VALUES ('c50402082e20459c900bed085196ddef1575877225392', 19, 0, 'test', '0', '', '', '', '', '', '', '', '2019-12-09 15:40:25', '40288083679b5b0f01679b5b8d040000', 'sa', '2019-12-09 15:40:25', NULL, NULL, 'sa', 't', '2019-12-09 15:40:30', '', 0);
INSERT INTO "public"."base_organize" VALUES ('ed660d811d774580a3a133dd58f403ba1573552681780', 17, 13, 'test', 'test', '1212', '', '', '', '', '', '', '2019-11-12 17:58:01', '40288083679b5b0f01679b5b8d040000', 'sa', '2019-11-12 17:58:01', NULL, NULL, 'sa', 't', '2019-11-12 17:58:55', '', 1);
INSERT INTO "public"."base_organize" VALUES ('f6a000b6f9944f8d8556d8910c21790a1575877242802', 20, 13, 'test', '0', '', '', '', '', '', '', '', '2019-12-09 15:40:42', '40288083679b5b0f01679b5b8d040000', 'sa', '2019-12-09 15:40:42', NULL, NULL, 'sa', 't', '2019-12-09 15:40:49', '', 0);
INSERT INTO "public"."base_organize" VALUES ('ff8080816835cf1e016835d784d80002', 13, 0, '服务机构', 'FUWUJIGOU', '', '', '', '', '', '', '', '2019-01-10 11:39:03', '40288083679b5b0f01679b5b8d040000', 'sa', '2019-01-28 08:57:16', '40288083685425d901685427f0590000', 'test', NULL, 'f', NULL, '', 1);
INSERT INTO "public"."base_organize" VALUES ('ff8080816835cf1e016835d7e4220003', 14, 13, '客服团队', 'FWJG-KF', '', '', '', '', '', '', '', '2019-01-10 11:39:27', '40288083679b5b0f01679b5b8d040000', 'sa', '2019-01-28 08:57:46', '40288083685425d901685427f0590000', 'test', NULL, 'f', NULL, '', 1);
INSERT INTO "public"."base_organize" VALUES ('ff8080816835cf1e016835d842230004', 15, 13, '管理团队', 'FWJG-GL', '', '', '', '', '', '', '', '2019-01-10 11:39:51', '40288083679b5b0f01679b5b8d040000', 'sa', '2019-01-28 08:58:47', '40288083685425d901685427f0590000', 'test', NULL, 'f', NULL, '', 1);
INSERT INTO "public"."base_organize" VALUES ('ff8080816835cf1e016835d8fc340005', 16, 13, '客户团队', 'FWJG-KH', '', '', '', '', '', '', '', '2019-01-10 11:40:39', '40288083679b5b0f01679b5b8d040000', 'sa', '2019-11-01 10:31:34', '40288083679b5b0f01679b5b8d040000', 'sa', NULL, 'f', NULL, '.', 1);
INSERT INTO "public"."base_organize" VALUES ('1f0407ffc3b345c9b1fc3f0b392dd3291576044432415', 4, 3, 'test01', 'test01', '', '', '', '', '', '', '', '2019-12-11 14:07:12', '40288083679b5b0f01679b5b8d040000', 'sa', '2019-12-11 14:07:12', NULL, NULL, 'sa', 't', '2019-12-11 14:07:21', '', 1);
INSERT INTO "public"."base_organize" VALUES ('1', 3, 0, 'test', 'test', NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2019-12-09 15:40:25', 'ruigeId', 'ruige', NULL, NULL, NULL, 'sa', 't', '2019-12-11 14:07:21', NULL, 1);

-- ----------------------------
-- Table structure for base_organize_role
-- ----------------------------
DROP TABLE IF EXISTS "public"."base_organize_role";
CREATE TABLE "public"."base_organize_role" (
  "id" varchar(64) COLLATE "pg_catalog"."default" NOT NULL,
  "baseorganizeid" varchar(64) COLLATE "pg_catalog"."default" NOT NULL,
  "baseroleid" varchar(64) COLLATE "pg_catalog"."default" NOT NULL
)
;

-- ----------------------------
-- Records of base_organize_role
-- ----------------------------
INSERT INTO "public"."base_organize_role" VALUES ('0321727cbaea456d8380cdc19d406d871572940333178', 'ff8080816835cf1e016835d842230004', '734abf12838e4fe883ba8cd7820a3f521572940332975');
INSERT INTO "public"."base_organize_role" VALUES ('4028808368595df50168596ab8b000a1', 'ff8080816835cf1e016835d842230004', '402867826516fc7f0165171189510001');
INSERT INTO "public"."base_organize_role" VALUES ('40288083690eedb701690eee853d0000', 'ff8080816835cf1e016835d7e4220003', '4028808368595df501685962c8e20000');
INSERT INTO "public"."base_organize_role" VALUES ('8bf1c68bc6194249a4ae59011ac74a381572852307647', 'ff8080816835cf1e016835d784d80002', 'b8cfd7b8e9d44d2ab432431de46c300f1572852307647');

-- ----------------------------
-- Table structure for base_role
-- ----------------------------
DROP TABLE IF EXISTS "public"."base_role";
CREATE TABLE "public"."base_role" (
  "id" varchar(64) COLLATE "pg_catalog"."default" NOT NULL,
  "roleencode" varchar(64) COLLATE "pg_catalog"."default" NOT NULL,
  "rolename" varchar(64) COLLATE "pg_catalog"."default" NOT NULL,
  "roletype" varchar(64) COLLATE "pg_catalog"."default" NOT NULL,
  "issys" bool NOT NULL DEFAULT false,
  "addtime" timestamp(6) NOT NULL,
  "adduserid" varchar(64) COLLATE "pg_catalog"."default" NOT NULL,
  "addusername" varchar(64) COLLATE "pg_catalog"."default" NOT NULL,
  "modifytime" timestamp(6),
  "modifyuserid" varchar(64) COLLATE "pg_catalog"."default" DEFAULT NULL::character varying,
  "modifyname" varchar(64) COLLATE "pg_catalog"."default" DEFAULT NULL::character varying,
  "deletename" varchar(64) COLLATE "pg_catalog"."default" DEFAULT NULL::character varying,
  "deletemark" bool NOT NULL DEFAULT true,
  "deletetime" timestamp(6),
  "remark" varchar(512) COLLATE "pg_catalog"."default" DEFAULT NULL::character varying,
  "sortcode" int4 DEFAULT 1
)
;

-- ----------------------------
-- Records of base_role
-- ----------------------------
INSERT INTO "public"."base_role" VALUES ('402867826516fc7f0165171189510001', 'SuperAdmin', '超级管理员', 'SuperManager', 't', '2017-08-02 10:10:16', 'sa', 'sa', '2019-01-17 09:26:32', '40288083679b5b0f01679b5b8d040000', 'sa', NULL, 'f', NULL, '超级管理员', 0);
INSERT INTO "public"."base_role" VALUES ('4028808368595df501685962c8e20000', 'GeneralAdmin', '普通管理员', 'SystemManager', 't', '2019-01-17 09:17:52', '40288083679b5b0f01679b5b8d040000', 'sa', '2019-02-21 15:21:46', '40288083679b5b0f01679b5b8d040000', 'sa', NULL, 'f', NULL, '普通管理员000', 1);
INSERT INTO "public"."base_role" VALUES ('734abf12838e4fe883ba8cd7820a3f521572940332975', 'taibao', 'taibao', 'SystemManager', 't', '2019-11-05 15:52:12', 'e1b0280a1d534a15bd7ce11dec44f2051572852405632', 'taibao-test', '2019-11-05 15:52:12', NULL, NULL, NULL, 'f', NULL, '', 11);
INSERT INTO "public"."base_role" VALUES ('b8cfd7b8e9d44d2ab432431de46c300f1572852307647', 'csgly', '测试管理员', 'SystemManager', 't', '2019-11-04 15:25:07', '40288083679b5b0f01679b5b8d040000', 'sa', '2019-11-04 15:25:07', NULL, NULL, NULL, 'f', NULL, '', 1);

-- ----------------------------
-- Table structure for base_systemlog
-- ----------------------------
DROP TABLE IF EXISTS "public"."base_systemlog";
CREATE TABLE "public"."base_systemlog" (
  "id" varchar(64) COLLATE "pg_catalog"."default" NOT NULL,
  "accessmode" varchar(32) COLLATE "pg_catalog"."default" DEFAULT NULL::character varying,
  "businessmodule" varchar(128) COLLATE "pg_catalog"."default" DEFAULT NULL::character varying,
  "actiontype" varchar(32) COLLATE "pg_catalog"."default" DEFAULT NULL::character varying,
  "hostip" varchar(64) COLLATE "pg_catalog"."default" DEFAULT NULL::character varying,
  "operurl" varchar(512) COLLATE "pg_catalog"."default" DEFAULT NULL::character varying,
  "operparams" varchar(1024) COLLATE "pg_catalog"."default" DEFAULT NULL::character varying,
  "operresult" varchar(1024) COLLATE "pg_catalog"."default" DEFAULT NULL::character varying,
  "status" varchar(64) COLLATE "pg_catalog"."default" DEFAULT NULL::character varying,
  "addtime" timestamp(6) NOT NULL,
  "adduserid" varchar(64) COLLATE "pg_catalog"."default" NOT NULL,
  "addusername" varchar(64) COLLATE "pg_catalog"."default" NOT NULL,
  "modifytime" timestamp(6),
  "modifyuserid" varchar(64) COLLATE "pg_catalog"."default" DEFAULT NULL::character varying,
  "modifyname" varchar(64) COLLATE "pg_catalog"."default" DEFAULT NULL::character varying,
  "deletename" varchar(64) COLLATE "pg_catalog"."default" DEFAULT NULL::character varying,
  "deletetime" timestamp(6),
  "deletemark" bool NOT NULL DEFAULT false
)
;

-- ----------------------------
-- Records of base_systemlog
-- ----------------------------
INSERT INTO "public"."base_systemlog" VALUES ('0d9757203b1346f48493788a8358aa071575879721998', '前台页面', '管理员模块', '登出', '192.168.0.8', '/demo/foying/web/admin/Login/logout', NULL, '{"ResCode":"100","ResMsg":"退出登录"}', '成功', '2019-12-09 16:19:58', '系统id', '系统name', NULL, NULL, NULL, NULL, NULL, 'f');
INSERT INTO "public"."base_systemlog" VALUES ('0f0e513adc7049fc8a9417389188c3a41575881189544', '前台页面', '字典信息模块', '删除', '192.168.0.8', '/demo/foying/web/admin/BaseItems/deleteSingleBaseItems', '[{"id":"1bb33ab8712c4cf0bf9e8dacb4e107471575877651798"}]', '{"ResCode":"201","ResMsg":"访问异常"}', '失败', '2019-12-09 16:44:22', '系统id', '系统name', NULL, NULL, NULL, NULL, NULL, 'f');
INSERT INTO "public"."base_systemlog" VALUES ('1098c7a7f8bc4cb4b8f8bd4bdacf0ac21575878858121', '前台页面', '字典信息模块', '删除', '192.168.0.8', '/demo/foying/web/admin/BaseItems/deleteSingleBaseItems', '[{"id":"1bb33ab8712c4cf0bf9e8dacb4e107471575877651798"}]', '{"ResCode":"201","ResMsg":"访问异常"}', '失败', '2019-12-09 16:06:08', '系统id', '系统name', NULL, NULL, NULL, NULL, NULL, 'f');
INSERT INTO "public"."base_systemlog" VALUES ('18fcf60686af4b12be957022390ea2d91575880395839', '前台页面', '字典信息模块', '删除', '192.168.0.8', '/demo/foying/web/admin/BaseItems/deleteSingleBaseItems', '[{"id":"1bb33ab8712c4cf0bf9e8dacb4e107471575877651798"}]', '{"ResCode":"201","ResMsg":"访问异常"}', '失败', '2019-12-09 16:31:10', '系统id', '系统name', NULL, NULL, NULL, NULL, NULL, 'f');
INSERT INTO "public"."base_systemlog" VALUES ('206443ddbe3c416c8bc2c4334f7c978f1575879541997', '前台页面', '字典信息模块', '删除', '192.168.0.8', '/demo/foying/web/admin/BaseItems/deleteSingleBaseItems', '[{"id":"1bb33ab8712c4cf0bf9e8dacb4e107471575877651798"}]', '{"ResCode":"100","ResMsg":"删除数据成功!"}', '成功', '2019-12-09 16:16:46', '系统id', '系统name', NULL, NULL, NULL, NULL, NULL, 'f');
INSERT INTO "public"."base_systemlog" VALUES ('37ec1e144a3e471cb3e3dbb10df2d3491575878119328', '前台页面', '字典信息模块', '删除', '192.168.0.8', '/demo/foying/web/admin/BaseItems/deleteSingleBaseItems', '[{"id":"1bb33ab8712c4cf0bf9e8dacb4e107471575877651798"}]', '{"ResCode":"201","ResMsg":"访问异常"}', '失败', '2019-12-09 15:54:02', '系统id', '系统name', NULL, NULL, NULL, NULL, NULL, 'f');
INSERT INTO "public"."base_systemlog" VALUES ('3fa48175340148b88d687826b1fa8df51575879541997', '前台页面', '管理员模块', '登出', '192.168.0.8', '/demo/foying/web/admin/Login/logout', NULL, '{"ResCode":"100","ResMsg":"退出登录"}', '成功', '2019-12-09 16:18:42', '系统id', '系统name', NULL, NULL, NULL, NULL, NULL, 'f');
INSERT INTO "public"."base_systemlog" VALUES ('466474f352e54b87a010c29fd1871a141575878119328', '前台页面', '管理员模块', '登录', '192.168.0.8', '/demo/foying/web/admin/Login/login', NULL, '{"ResCode":"100","ResMsg":"登陆成功","entity":{"account":"sa","email":"","extentionNumber":"1","id":"40288083679b5b0f01679b5b8d040000","realName":"sa","roleName":"超级管理员","telephone":"","workNumber":"1"}}', '成功', '2019-12-09 15:52:33', '系统id', '系统name', NULL, NULL, NULL, NULL, NULL, 'f');
INSERT INTO "public"."base_systemlog" VALUES ('4adecde1b7c0487e988649d0ab44ddbe1575879721998', '前台页面', '管理员模块', '登录', '192.168.0.8', '/demo/foying/web/admin/Login/login', NULL, '{"ResCode":"100","ResMsg":"登陆成功","entity":{"account":"sa","email":"","extentionNumber":"1","id":"40288083679b5b0f01679b5b8d040000","realName":"sa","roleName":"超级管理员","telephone":"","workNumber":"1"}}', '成功', '2019-12-09 16:20:04', '系统id', '系统name', NULL, NULL, NULL, NULL, NULL, 'f');
INSERT INTO "public"."base_systemlog" VALUES ('537965b0ce2a4bea8feab56c8fed1b151575881630654', '前台页面', '字典信息模块', '删除', '192.168.0.8', '/demo/foying/web/admin/BaseItems/deleteSingleBaseItems', '[{"id":"1bb33ab8712c4cf0bf9e8dacb4e107471575877651798"}]', '{"ResCode":"100","ResMsg":"删除数据成功!"}', '成功', '2019-12-09 16:52:45', '系统id', '系统name', NULL, NULL, NULL, NULL, NULL, 'f');
INSERT INTO "public"."base_systemlog" VALUES ('562aa508a90d4fd2b40392f0282a575c1575881897218', '前台页面', '字典信息模块', '删除', '192.168.0.8', '/demo/foying/web/admin/BaseItems/deleteSingleBaseItems', '[{"id":"1bb33ab8712c4cf0bf9e8dacb4e107471575877651798"}]', '{"ResCode":"100","ResMsg":"删除数据成功!"}', '成功', '2019-12-09 16:56:29', '系统id', '系统name', NULL, NULL, NULL, NULL, NULL, 'f');
INSERT INTO "public"."base_systemlog" VALUES ('65468cd46d80488fafa06853942031861575879181994', '前台页面', '管理员模块', '登录', '192.168.0.8', '/demo/foying/web/admin/Login/login', NULL, '{"ResCode":"100","ResMsg":"登陆成功","entity":{"account":"sa","email":"","extentionNumber":"1","id":"40288083679b5b0f01679b5b8d040000","realName":"sa","roleName":"超级管理员","telephone":"","workNumber":"1"}}', '成功', '2019-12-09 16:10:15', '系统id', '系统name', NULL, NULL, NULL, NULL, NULL, 'f');
INSERT INTO "public"."base_systemlog" VALUES ('708881e8743e469f8546f67074ef3b241575878119328', '前台页面', '字典详情模块', '添加', '192.168.0.8', '/demo/foying/web/admin/BaseItemsDetail/addBaseItemsDetail', '[{"baseItemsId":"1bb33ab8712c4cf0bf9e8dacb4e107471575877651798","enCode":"test04","itemName":"test04","remark":"","sortCode":4}]', '{"ResCode":"100","ResMsg":"添加字典成功!"}', '成功', '2019-12-09 15:53:44', '系统id', '系统name', NULL, NULL, NULL, NULL, NULL, 'f');
INSERT INTO "public"."base_systemlog" VALUES ('726f1e33a4d149dda8719f6302975cb01575879181994', '前台页面', '字典信息模块', '删除', '192.168.0.8', '/demo/foying/web/admin/BaseItems/deleteSingleBaseItems', '[{"id":"1bb33ab8712c4cf0bf9e8dacb4e107471575877651798"}]', '{"ResCode":"100","ResMsg":"删除数据成功!"}', '成功', '2019-12-09 16:10:52', '系统id', '系统name', NULL, NULL, NULL, NULL, NULL, 'f');
INSERT INTO "public"."base_systemlog" VALUES ('7bccb8739d1a4f6ead20e20fb5fff0061575862975421', '前台页面', '管理员模块', '登录', '192.168.0.8', '/demo/foying/web/admin/Login/login', NULL, '{"ResCode":"201","ResMsg":"登陆失败"}', '失败', '2019-12-09 11:41:51', '系统id', '系统name', NULL, NULL, NULL, NULL, NULL, 'f');
INSERT INTO "public"."base_systemlog" VALUES ('82a1c7719b714e8d8db5517de37980361575881189544', '前台页面', '管理员模块', '登录', '192.168.0.8', '/demo/foying/web/admin/Login/login', NULL, '{"ResCode":"100","ResMsg":"登陆成功","entity":{"account":"sa","email":"","extentionNumber":"1","id":"40288083679b5b0f01679b5b8d040000","realName":"sa","roleName":"超级管理员","telephone":"","workNumber":"1"}}', '成功', '2019-12-09 16:43:46', '系统id', '系统name', NULL, NULL, NULL, NULL, NULL, 'f');
INSERT INTO "public"."base_systemlog" VALUES ('8de7ba25c2544046bb6fc0d1155717ad1575881450653', '前台页面', '字典信息模块', '删除', '192.168.0.8', '/demo/foying/web/admin/BaseItems/deleteSingleBaseItems', '[{"id":"1bb33ab8712c4cf0bf9e8dacb4e107471575877651798"}]', '{"ResCode":"201","ResMsg":"访问异常"}', '失败', '2019-12-09 16:48:17', '系统id', '系统name', NULL, NULL, NULL, NULL, NULL, 'f');
INSERT INTO "public"."base_systemlog" VALUES ('8eed5a4984404d7f9a3645b2399eab271575880270550', '前台页面', '字典信息模块', '删除', '192.168.0.8', '/demo/foying/web/admin/BaseItems/deleteSingleBaseItems', '[{"id":"1bb33ab8712c4cf0bf9e8dacb4e107471575877651798"}]', '{"ResCode":"201","ResMsg":"访问异常"}', '失败', '2019-12-09 16:27:41', '系统id', '系统name', NULL, NULL, NULL, NULL, NULL, 'f');
INSERT INTO "public"."base_systemlog" VALUES ('9161afc43c724949b1688f36b2bf9a901575881450653', '前台页面', '管理员模块', '登录', '192.168.0.8', '/demo/foying/web/admin/Login/login', NULL, '{"ResCode":"100","ResMsg":"登陆成功","entity":{"account":"sa","email":"","extentionNumber":"1","id":"40288083679b5b0f01679b5b8d040000","realName":"sa","roleName":"超级管理员","telephone":"","workNumber":"1"}}', '成功', '2019-12-09 16:48:09', '系统id', '系统name', NULL, NULL, NULL, NULL, NULL, 'f');
INSERT INTO "public"."base_systemlog" VALUES ('9c7313d11e9c4c6dbf458eee642f91b01575879721998', '前台页面', '管理员模块', '登出', '192.168.0.8', '/demo/foying/web/admin/Login/logout', NULL, '{"ResCode":"100","ResMsg":"退出登录"}', '成功', '2019-12-09 16:19:58', '系统id', '系统name', NULL, NULL, NULL, NULL, NULL, 'f');
INSERT INTO "public"."base_systemlog" VALUES ('b07074a3b2ee448ea6b1511daef0c9f51575880270550', '前台页面', '管理员模块', '登录', '192.168.0.8', '/demo/foying/web/admin/Login/login', NULL, '{"ResCode":"100","ResMsg":"登陆成功","entity":{"account":"sa","email":"","extentionNumber":"1","id":"40288083679b5b0f01679b5b8d040000","realName":"sa","roleName":"超级管理员","telephone":"","workNumber":"1"}}', '成功', '2019-12-09 16:27:33', '系统id', '系统name', NULL, NULL, NULL, NULL, NULL, 'f');
INSERT INTO "public"."base_systemlog" VALUES ('b1a5a1b039184386a6c5b991b79b11bd1575862255416', '前台页面', '管理员模块', '登录', '192.168.0.8', '/demo/foying/web/admin/Login/login', NULL, '{"ResCode":"201","ResMsg":"登陆失败"}', '失败', '2019-12-09 11:28:08', '系统id', '系统name', NULL, NULL, NULL, NULL, NULL, 'f');
INSERT INTO "public"."base_systemlog" VALUES ('b3b76985088b4c13ae93bf9d303b7c771575940412662', '前台页面', '管理员模块', '登录', '192.168.0.8', '/demo/foying/web/admin/Login/login', NULL, '{"ResCode":"100","ResMsg":"登陆成功","entity":{"account":"sa","email":"","extentionNumber":"1","id":"40288083679b5b0f01679b5b8d040000","realName":"sa","roleName":"超级管理员","telephone":"","workNumber":"1"}}', '成功', '2019-12-10 09:11:02', '系统id', '系统name', NULL, NULL, NULL, NULL, NULL, 'f');
INSERT INTO "public"."base_systemlog" VALUES ('cc83fcac2e474967b78065904ed8b88e1575879541997', '前台页面', '管理员模块', '登录', '192.168.0.8', '/demo/foying/web/admin/Login/login', NULL, '{"ResCode":"100","ResMsg":"登陆成功","entity":{"account":"sa","email":"","extentionNumber":"1","id":"40288083679b5b0f01679b5b8d040000","realName":"sa","roleName":"超级管理员","telephone":"","workNumber":"1"}}', '成功', '2019-12-09 16:18:48', '系统id', '系统name', NULL, NULL, NULL, NULL, NULL, 'f');
INSERT INTO "public"."base_systemlog" VALUES ('eba81eade83341d487bc03e57108f2ec1575878858121', '前台页面', '管理员模块', '登录', '192.168.0.8', '/demo/foying/web/admin/Login/login', NULL, '{"ResCode":"100","ResMsg":"登陆成功","entity":{"account":"sa","email":"","extentionNumber":"1","id":"40288083679b5b0f01679b5b8d040000","realName":"sa","roleName":"超级管理员","telephone":"","workNumber":"1"}}', '成功', '2019-12-09 16:04:59', '系统id', '系统name', NULL, NULL, NULL, NULL, NULL, 'f');
INSERT INTO "public"."base_systemlog" VALUES ('ef65b691ebb44bbcb716ebf151185be41575878119328', '前台页面', '字典详情模块', '删除', '192.168.0.8', '/demo/foying/web/admin/BaseItemsDetail/deleteSingleBaseItemsDetail', '[{"id":"9ec14b74d1aa4cea97890c439ae07bf61575877720111"}]', '{"ResCode":"100","ResMsg":"删除数据成功!"}', '成功', '2019-12-09 15:53:52', '系统id', '系统name', NULL, NULL, NULL, NULL, NULL, 'f');
INSERT INTO "public"."base_systemlog" VALUES ('f156f321f68249b09cbae361fb73f6c01575881630654', '前台页面', '字典详情模块', '删除', '192.168.0.8', '/demo/foying/web/admin/BaseItemsDetail/deleteSingleBaseItemsDetail', '[{"id":"641e76a8af0a44b082d6443b0cb066e61575878024114"}]', '{"ResCode":"100","ResMsg":"删除数据成功!"}', '成功', '2019-12-09 16:51:55', '系统id', '系统name', NULL, NULL, NULL, NULL, NULL, 'f');
INSERT INTO "public"."base_systemlog" VALUES ('f3e75f158701407094a2748e9315e92f1575881897218', '前台页面', '管理员模块', '登录', '192.168.0.8', '/demo/foying/web/admin/Login/login', NULL, '{"ResCode":"100","ResMsg":"登陆成功","entity":{"account":"sa","email":"","extentionNumber":"1","id":"40288083679b5b0f01679b5b8d040000","realName":"sa","roleName":"超级管理员","telephone":"","workNumber":"1"}}', '成功', '2019-12-09 16:56:17', '系统id', '系统name', NULL, NULL, NULL, NULL, NULL, 'f');

-- ----------------------------
-- Table structure for wechat_user_info
-- ----------------------------
DROP TABLE IF EXISTS "public"."wechat_user_info";
CREATE TABLE "public"."wechat_user_info" (
  "id" varchar(64) COLLATE "pg_catalog"."default" NOT NULL,
  "openid" varchar(64) COLLATE "pg_catalog"."default" DEFAULT NULL::character varying,
  "nickname" varchar(256) COLLATE "pg_catalog"."default" DEFAULT NULL::character varying,
  "headimgurl" varchar(512) COLLATE "pg_catalog"."default" DEFAULT NULL::character varying,
  "sex" varchar(8) COLLATE "pg_catalog"."default" DEFAULT NULL::character varying,
  "language" varchar(32) COLLATE "pg_catalog"."default" DEFAULT NULL::character varying,
  "country" varchar(256) COLLATE "pg_catalog"."default" DEFAULT NULL::character varying,
  "province" varchar(256) COLLATE "pg_catalog"."default" DEFAULT NULL::character varying,
  "city" varchar(256) COLLATE "pg_catalog"."default" DEFAULT NULL::character varying,
  "subscribe_time" varchar(64) COLLATE "pg_catalog"."default" DEFAULT NULL::character varying,
  "unionid" varchar(64) COLLATE "pg_catalog"."default" DEFAULT NULL::character varying,
  "groupid" varchar(64) COLLATE "pg_catalog"."default" DEFAULT NULL::character varying,
  "tagid_list" varchar(512) COLLATE "pg_catalog"."default" DEFAULT NULL::character varying,
  "subscribe_scene" varchar(64) COLLATE "pg_catalog"."default" DEFAULT NULL::character varying,
  "qr_scene" varchar(64) COLLATE "pg_catalog"."default" DEFAULT NULL::character varying,
  "qr_scene_str" varchar(512) COLLATE "pg_catalog"."default" DEFAULT NULL::character varying,
  "subscribe" varchar(8) COLLATE "pg_catalog"."default" DEFAULT NULL::character varying,
  "errmsg" varchar(64) COLLATE "pg_catalog"."default" DEFAULT NULL::character varying,
  "errcode" varchar(64) COLLATE "pg_catalog"."default" DEFAULT NULL::character varying,
  "remark" varchar(512) COLLATE "pg_catalog"."default" DEFAULT NULL::character varying,
  "addtime" timestamp(6) NOT NULL,
  "adduserid" varchar(64) COLLATE "pg_catalog"."default" NOT NULL,
  "addusername" varchar(64) COLLATE "pg_catalog"."default" NOT NULL,
  "modifytime" timestamp(6),
  "modifyuserid" varchar(64) COLLATE "pg_catalog"."default" DEFAULT NULL::character varying,
  "modifyname" varchar(64) COLLATE "pg_catalog"."default" DEFAULT NULL::character varying,
  "deletemark" bool NOT NULL DEFAULT false,
  "deletename" varchar(64) COLLATE "pg_catalog"."default" DEFAULT NULL::character varying,
  "deletetime" timestamp(6)
)
;

-- ----------------------------
-- Alter sequences owned by
-- ----------------------------
SELECT setval('"public"."t_baseitems_mainid_seq"', 2, true);
SELECT setval('"public"."t_basenavigation_mainid_seq"', 2, false);
SELECT setval('"public"."t_baseorganize_mainid_seq"', 5, true);

-- ----------------------------
-- Primary Key structure for table base_area
-- ----------------------------
ALTER TABLE "public"."base_area" ADD CONSTRAINT "base_area1_pkey" PRIMARY KEY ("id");

-- ----------------------------
-- Primary Key structure for table base_items
-- ----------------------------
ALTER TABLE "public"."base_items" ADD CONSTRAINT "base_items_pkey" PRIMARY KEY ("id");

-- ----------------------------
-- Primary Key structure for table base_itemsdetail
-- ----------------------------
ALTER TABLE "public"."base_itemsdetail" ADD CONSTRAINT "base_itemsdetail_pkey" PRIMARY KEY ("id");

-- ----------------------------
-- Primary Key structure for table base_manager
-- ----------------------------
ALTER TABLE "public"."base_manager" ADD CONSTRAINT "base_manager_pkey" PRIMARY KEY ("id");

-- ----------------------------
-- Primary Key structure for table base_manager_role
-- ----------------------------
ALTER TABLE "public"."base_manager_role" ADD CONSTRAINT "base_manager_role_pkey" PRIMARY KEY ("id");

-- ----------------------------
-- Primary Key structure for table base_navigation
-- ----------------------------
ALTER TABLE "public"."base_navigation" ADD CONSTRAINT "base_navigation1_pkey" PRIMARY KEY ("id");

-- ----------------------------
-- Primary Key structure for table base_navigation_role
-- ----------------------------
ALTER TABLE "public"."base_navigation_role" ADD CONSTRAINT "base_navigation_role_pkey" PRIMARY KEY ("id");

-- ----------------------------
-- Primary Key structure for table base_organize
-- ----------------------------
ALTER TABLE "public"."base_organize" ADD CONSTRAINT "base_organize1_pkey" PRIMARY KEY ("id");

-- ----------------------------
-- Primary Key structure for table base_organize_role
-- ----------------------------
ALTER TABLE "public"."base_organize_role" ADD CONSTRAINT "base_organize_role_pkey" PRIMARY KEY ("id");

-- ----------------------------
-- Primary Key structure for table base_role
-- ----------------------------
ALTER TABLE "public"."base_role" ADD CONSTRAINT "base_role1_pkey" PRIMARY KEY ("id");

-- ----------------------------
-- Primary Key structure for table base_systemlog
-- ----------------------------
ALTER TABLE "public"."base_systemlog" ADD CONSTRAINT "base_systemlog1_pkey" PRIMARY KEY ("id");

-- ----------------------------
-- Primary Key structure for table wechat_user_info
-- ----------------------------
ALTER TABLE "public"."wechat_user_info" ADD CONSTRAINT "wechat_user_info1_pkey" PRIMARY KEY ("id");
