package com.example.administrator.sharedemo;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wjw on 2017/10/17.
 */

public class ResponsePayBean implements Parcelable {


        private String body;
        private int inventories;
        private String itemId;
        private String itemName;
        private String buyPrice;

    private String attributeId;
    private String id;
    private String ids;
    private String productId;

    private String logoUrl;
    private String counts;
    private String mallPrice;
    private String marketPrice;
    private String saleCount;
    private String givePoint;
    private String isFollow ;
    //团购详情 字段
    private long beginTime ;
    private long endTime ;
    private String title;
    private String prePurchase;
    private String maxPurchaseNum;
    private String remainPurchaseNum;
    private String placeOrderNum;
    private String minPersonNum;
    private String remark;
    private String remainPersonNum;
    private String sellPrice;
    private String productLogo;
    private String shareUrl;
    private String notice;

    private String luckConfigDetailId;
    private String luckFlag;
    private String lotteryNum;


    //积分详情
    private String changePoint;

    private String attributes ;
    private String supplierLogo;
    private String supplierId;
    private String supplierName;
    private String flag;
    private String attrValueIdOne;
    private String attrValueIdTwo;
    private String[] videoUrls;
    private ArrayList<VideosBean> videos;



    private List<Evaluates> evaluates;
    private List<String> images;
    private List<ItemAttribute> itemAttribute;
    private List<ItemAttributeRef> itemAttributeRef;
    private List<ItemAttribute> itemAttributeGeneral;
    private List<String> userLogoList;


    public ArrayList<VideosBean> getVideos() {
        return videos;
    }

    public void setVideos(ArrayList<VideosBean> videos) {
        this.videos = videos;
    }

    public static class VideosBean implements Parcelable {
        private String videoUrl;
        private String logoUrl;


        public String getVideoUrl() {
            return videoUrl;
        }

        public void setVideoUrl(String videoUrl) {
            this.videoUrl = videoUrl;
        }

        public String getLogoUrl() {
            return logoUrl;
        }

        public void setLogoUrl(String logoUrl) {
            this.logoUrl = logoUrl;
        }

        @Override
        public int describeContents() {
            return 0;
        }

        @Override
        public void writeToParcel(Parcel dest, int flags) {
            dest.writeString(this.videoUrl);
            dest.writeString(this.logoUrl);
        }

        public VideosBean() {
        }

        protected VideosBean(Parcel in) {
            this.videoUrl = in.readString();
            this.logoUrl = in.readString();
        }

        public  static final Creator<VideosBean> CREATOR = new Creator<VideosBean>() {
            @Override
            public VideosBean createFromParcel(Parcel source) {
                return new VideosBean(source);
            }

            @Override
            public VideosBean[] newArray(int size) {
                return new VideosBean[size];
            }
        };
    }

    public String[] getVideoUrls() {
        return videoUrls;
    }

    public void setVideoUrls(String[] videoUrls) {
        this.videoUrls = videoUrls;
    }

    public String getLotteryNum() {
        return lotteryNum;
    }

    public void setLotteryNum(String lotteryNum) {
        this.lotteryNum = lotteryNum;
    }

    public String getLuckConfigDetailId() {
        return luckConfigDetailId;
    }

    public void setLuckConfigDetailId(String luckConfigDetailId) {
        this.luckConfigDetailId = luckConfigDetailId;
    }

    public String getLuckFlag() {
        return luckFlag;
    }

    public void setLuckFlag(String luckFlag) {
        this.luckFlag = luckFlag;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getIds() {
        return ids;
    }

    public void setIds(String ids) {
        this.ids = ids;
    }

    public String getBuyPrice() {
        return buyPrice;
    }

    public void setBuyPrice(String buyPrice) {
        this.buyPrice = buyPrice;
    }

    public String getNotice() {
        return notice;
    }

    public void setNotice(String notice) {
        this.notice = notice;
    }

    public String getShareUrl() {
        return shareUrl;
    }

    public void setShareUrl(String shareUrl) {
        this.shareUrl = shareUrl;
    }


    public List<ItemAttribute> getItemAttributeGeneral() {
        return itemAttributeGeneral;
    }

    public void setItemAttributeGeneral(List<ItemAttribute> itemAttributeGeneral) {
        this.itemAttributeGeneral = itemAttributeGeneral;
    }

    public String getChangePoint() {
        return changePoint;
    }

    public void setChangePoint(String changePoint) {
        this.changePoint = changePoint;
    }

    public List<String> getUserLogoList() {
        return userLogoList;
    }

    public void setUserLogoList(List<String> userLogoList) {
        this.userLogoList = userLogoList;
    }

    public long getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(long beginTime) {
        this.beginTime = beginTime;
    }

    public long getEndTime() {
        return endTime;
    }

    public void setEndTime(long endTime) {
        this.endTime = endTime;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPrePurchase() {
        return prePurchase;
    }

    public void setPrePurchase(String prePurchase) {
        this.prePurchase = prePurchase;
    }

    public String getMaxPurchaseNum() {
        return maxPurchaseNum;
    }

    public void setMaxPurchaseNum(String maxPurchaseNum) {
        this.maxPurchaseNum = maxPurchaseNum;
    }

    public String getRemainPurchaseNum() {
        return remainPurchaseNum;
    }

    public void setRemainPurchaseNum(String remainPurchaseNum) {
        this.remainPurchaseNum = remainPurchaseNum;
    }

    public String getPlaceOrderNum() {
        return placeOrderNum;
    }

    public void setPlaceOrderNum(String placeOrderNum) {
        this.placeOrderNum = placeOrderNum;
    }

    public String getMinPersonNum() {
        return minPersonNum;
    }

    public void setMinPersonNum(String minPersonNum) {
        this.minPersonNum = minPersonNum;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getRemainPersonNum() {
        return remainPersonNum;
    }

    public void setRemainPersonNum(String remainPersonNum) {
        this.remainPersonNum = remainPersonNum;
    }

    public String getSellPrice() {
        return sellPrice;
    }

    public void setSellPrice(String sellPrice) {
        this.sellPrice = sellPrice;
    }

    public String getProductLogo() {
        return productLogo;
    }

    public void setProductLogo(String productLogo) {
        this.productLogo = productLogo;
    }

    public String getAttributeId() {
        return attributeId;
    }

    public void setAttributeId(String attributeId) {
        this.attributeId = attributeId;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLogoUrl() {
        return logoUrl;
    }

    public void setLogoUrl(String logoUrl) {
        this.logoUrl = logoUrl;
    }

    public static Creator<ResponsePayBean> getCREATOR() {
        return CREATOR;
    }

    public String getAttrValueIdOne() {
        return attrValueIdOne;
    }

    public void setAttrValueIdOne(String attrValueIdOne) {
        this.attrValueIdOne = attrValueIdOne;
    }

    public String getAttrValueIdTwo() {
        return attrValueIdTwo;
    }

    public void setAttrValueIdTwo(String attrValueIdTwo) {
        this.attrValueIdTwo = attrValueIdTwo;
    }

    public String getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(String supplierId) {
        this.supplierId = supplierId;
    }




    public String getMallPrice() {
        return mallPrice;
    }

    public void setMallPrice(String mallPrice) {
        this.mallPrice = mallPrice;
    }

    public String getMarketPrice() {
        return marketPrice;
    }

    public void setMarketPrice(String marketPrice) {
        this.marketPrice = marketPrice;
    }



    public String getAttributes() {
        return attributes;
    }

    public void setAttributes(String attributes) {
        this.attributes = attributes;
    }


    public String getCounts() {
        return counts;
    }

    public void setCounts(String counts) {
        this.counts = counts;
    }



    public static class ItemAttributeRef implements Parcelable {
            private String id;
            private String name;
            private String itemId;
            private List<AttrValue> attrValue;


            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getItemId() {
                return itemId;
            }

            public void setItemId(String itemId) {
                this.itemId = itemId;
            }

            public List<AttrValue> getAttrValue() {
                return attrValue;
            }

            public void setAttrValue(List<AttrValue> attrValue) {
                this.attrValue = attrValue;
            }


            public static class AttrValue implements Parcelable {
                private String id;
                private String value;
                private String attrId;
                public String getId() {
                    return id;
                }

                public void setId(String id) {
                    this.id = id;
                }

                public String getValue() {
                    return value;
                }

                public void setValue(String value) {
                    this.value = value;
                }

                public String getAttrId() {
                    return attrId;
                }

                public void setAttrId(String attrId) {
                    this.attrId = attrId;
                }

                @Override
                public int describeContents() {
                    return 0;
                }

                @Override
                public void writeToParcel(Parcel dest, int flags) {
                    dest.writeString(this.id);
                    dest.writeString(this.value);
                    dest.writeString(this.attrId);
                }

                public AttrValue() {
                }

                protected AttrValue(Parcel in) {
                    this.id = in.readString();
                    this.value = in.readString();
                    this.attrId = in.readString();
                }

                public static final Parcelable.Creator<AttrValue> CREATOR = new Parcelable.Creator<AttrValue>() {
                    @Override
                    public AttrValue createFromParcel(Parcel source) {
                        return new AttrValue(source);
                    }

                    @Override
                    public AttrValue[] newArray(int size) {
                        return new AttrValue[size];
                    }
                };
            }

        @Override
        public int describeContents() {
            return 0;
        }

        @Override
        public void writeToParcel(Parcel dest, int flags) {
            dest.writeString(this.id);
            dest.writeString(this.name);
            dest.writeString(this.itemId);
            dest.writeTypedList(this.attrValue);
        }

        public ItemAttributeRef() {
        }

        protected ItemAttributeRef(Parcel in) {
            this.id = in.readString();
            this.name = in.readString();
            this.itemId = in.readString();
            this.attrValue = in.createTypedArrayList(AttrValue.CREATOR);
        }

        public static final Parcelable.Creator<ItemAttributeRef> CREATOR = new Parcelable.Creator<ItemAttributeRef>() {
            @Override
            public ItemAttributeRef createFromParcel(Parcel source) {
                return new ItemAttributeRef(source);
            }

            @Override
            public ItemAttributeRef[] newArray(int size) {
                return new ItemAttributeRef[size];
            }
        };
    }

        public List<ItemAttribute> getItemAttribute() {
            return itemAttribute;
        }

        public void setItemAttribute(List<ItemAttribute> itemAttribute) {
            this.itemAttribute = itemAttribute;
        }

        public List<ItemAttributeRef> getItemAttributeRef() {
            return itemAttributeRef;
        }

        public void setItemAttributeRef(List<ItemAttributeRef> itemAttributeRef) {
            this.itemAttributeRef = itemAttributeRef;
        }

        public static class ItemAttribute implements Parcelable {
            private String attributeId;
            private String refPropertyOne;
            private String refPropertyTwo;
            private String buyPrice;
            private String sellPrice;
            private String marketPrice;
            private int inventory;
            private String givePoint;
            private String changePoint;


            public String getGivePoint() {
                return givePoint;
            }

            public void setGivePoint(String givePoint) {
                this.givePoint = givePoint;
            }

            public String getMarketPrice() {
                return marketPrice;
            }

            public void setMarketPrice(String marketPrice) {
                this.marketPrice = marketPrice;
            }

            public int getInventory() {
                return inventory;
            }

            public void setInventory(int inventory) {
                this.inventory = inventory;
            }

            public String getChangePoint() {
                return changePoint;
            }

            public void setChangePoint(String changePoint) {
                this.changePoint = changePoint;
            }

            public String getBuyPrice() {
                return buyPrice;
            }

            public void setBuyPrice(String buyPrice) {
                this.buyPrice = buyPrice;
            }

            public String getSellPrice() {
                return sellPrice;
            }

            public void setSellPrice(String sellPrice) {
                this.sellPrice = sellPrice;
            }

            public static Creator<ItemAttribute> getCREATOR() {
                return CREATOR;
            }

            public String getAttributeId() {
                return attributeId;
            }

            public void setAttributeId(String attributeId) {
                this.attributeId = attributeId;
            }

            public String getRefPropertyOne() {
                return refPropertyOne;
            }

            public void setRefPropertyOne(String refPropertyOne) {
                this.refPropertyOne = refPropertyOne;
            }

            public String getRefPropertyTwo() {
                return refPropertyTwo;
            }

            public void setRefPropertyTwo(String refPropertyTwo) {
                this.refPropertyTwo = refPropertyTwo;
            }

            public ItemAttribute() {
            }

            @Override
            public int describeContents() {
                return 0;
            }

            @Override
            public void writeToParcel(Parcel dest, int flags) {
                dest.writeString(this.attributeId);
                dest.writeString(this.refPropertyOne);
                dest.writeString(this.refPropertyTwo);
                dest.writeString(this.buyPrice);
                dest.writeString(this.sellPrice);
                dest.writeString(this.marketPrice);
                dest.writeInt(this.inventory);
                dest.writeString(this.givePoint);
                dest.writeString(this.changePoint);
            }

            protected ItemAttribute(Parcel in) {
                this.attributeId = in.readString();
                this.refPropertyOne = in.readString();
                this.refPropertyTwo = in.readString();
                this.buyPrice = in.readString();
                this.sellPrice = in.readString();
                this.marketPrice = in.readString();
                this.inventory = in.readInt();
                this.givePoint = in.readString();
                this.changePoint = in.readString();
            }

            public static final Creator<ItemAttribute> CREATOR = new Creator<ItemAttribute>() {
                @Override
                public ItemAttribute createFromParcel(Parcel source) {
                    return new ItemAttribute(source);
                }

                @Override
                public ItemAttribute[] newArray(int size) {
                    return new ItemAttribute[size];
                }
            };
        }

        public String getIsFollow() {
            return isFollow;
        }

        public void setIsFollow(String isFollow) {
            this.isFollow = isFollow;
        }

        public String getSupplierLogo() {
            return supplierLogo;
        }

        public void setSupplierLogo(String supplierLogo) {
            this.supplierLogo = supplierLogo;
        }

        public String getSupplierName() {
            return supplierName;
        }

        public void setSupplierName(String supplierName) {
            this.supplierName = supplierName;
        }



        public String getBody() {
            return body;
        }

        public void setBody(String body) {
            this.body = body;
        }

        public int getInventories() {
            return inventories;
        }

        public void setInventories(int inventories) {
            this.inventories = inventories;
        }

        public String getItemId() {
            return itemId;
        }

        public void setItemId(String itemId) {
            this.itemId = itemId;
        }

        public String getItemName() {
            return itemName;
        }

        public void setItemName(String itemName) {
            this.itemName = itemName;
        }



        public String getSaleCount() {
            return saleCount;
        }

        public void setSaleCount(String saleCount) {
            this.saleCount = saleCount;
        }

        public String getGivePoint() {
            return givePoint;
        }

        public void setGivePoint(String givePoint) {
            this.givePoint = givePoint;
        }

        public List<Evaluates> getEvaluates() {
            return evaluates;
        }

        public void setEvaluates(List<Evaluates> evaluates) {
            this.evaluates = evaluates;
        }

        public List<String> getImages() {
            return images;
        }

        public void setImages(List<String> images) {
            this.images = images;
        }

        public static class Evaluates implements Parcelable {
            private String content;
            private String createDate;
            private String id;
            private String itemId;
            private String orderNum;
            private String userId;
            private String logoUrl;
            private String nickName;

            public String getNickName() {
                return nickName;
            }

            public void setNickName(String nickName) {
                this.nickName = nickName;
            }

            public String getLogoUrl() {
                return logoUrl;
            }

            public void setLogoUrl(String logoUrl) {
                this.logoUrl = logoUrl;
            }

            public static Creator<Evaluates> getCREATOR() {
                return CREATOR;
            }

            public String getContent() {
                return content;
            }

            public void setContent(String content) {
                this.content = content;
            }

            public String getCreateDate() {
                return createDate;
            }

            public void setCreateDate(String createDate) {
                this.createDate = createDate;
            }

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public String getItemId() {
                return itemId;
            }

            public void setItemId(String itemId) {
                this.itemId = itemId;
            }

            public String getOrderNum() {
                return orderNum;
            }

            public void setOrderNum(String orderNum) {
                this.orderNum = orderNum;
            }

            public String getUserId() {
                return userId;
            }

            public void setUserId(String userId) {
                this.userId = userId;
            }

            @Override
            public int describeContents() {
                return 0;
            }

            @Override
            public void writeToParcel(Parcel dest, int flags) {
                dest.writeString(this.content);
                dest.writeString(this.createDate);
                dest.writeString(this.id);
                dest.writeString(this.itemId);
                dest.writeString(this.orderNum);
                dest.writeString(this.userId);
            }

            public Evaluates() {
            }

            protected Evaluates(Parcel in) {
                this.content = in.readString();
                this.createDate = in.readString();
                this.id = in.readString();
                this.itemId = in.readString();
                this.orderNum = in.readString();
                this.userId = in.readString();
            }

            public static final Parcelable.Creator<Evaluates> CREATOR = new Parcelable.Creator<Evaluates>() {
                @Override
                public Evaluates createFromParcel(Parcel source) {
                    return new Evaluates(source);
                }

                @Override
                public Evaluates[] newArray(int size) {
                    return new Evaluates[size];
                }
            };
        }


    public ResponsePayBean() {
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.body);
        dest.writeInt(this.inventories);
        dest.writeString(this.itemId);
        dest.writeString(this.itemName);
        dest.writeString(this.buyPrice);
        dest.writeString(this.attributeId);
        dest.writeString(this.id);
        dest.writeString(this.ids);
        dest.writeString(this.productId);
        dest.writeString(this.logoUrl);
        dest.writeString(this.counts);
        dest.writeString(this.mallPrice);
        dest.writeString(this.marketPrice);
        dest.writeString(this.saleCount);
        dest.writeString(this.givePoint);
        dest.writeString(this.isFollow);
        dest.writeLong(this.beginTime);
        dest.writeLong(this.endTime);
        dest.writeString(this.title);
        dest.writeString(this.prePurchase);
        dest.writeString(this.maxPurchaseNum);
        dest.writeString(this.remainPurchaseNum);
        dest.writeString(this.placeOrderNum);
        dest.writeString(this.minPersonNum);
        dest.writeString(this.remark);
        dest.writeString(this.remainPersonNum);
        dest.writeString(this.sellPrice);
        dest.writeString(this.productLogo);
        dest.writeString(this.shareUrl);
        dest.writeString(this.notice);
        dest.writeString(this.luckConfigDetailId);
        dest.writeString(this.luckFlag);
        dest.writeString(this.lotteryNum);
        dest.writeString(this.changePoint);
        dest.writeString(this.attributes);
        dest.writeString(this.supplierLogo);
        dest.writeString(this.supplierId);
        dest.writeString(this.supplierName);
        dest.writeString(this.flag);
        dest.writeString(this.attrValueIdOne);
        dest.writeString(this.attrValueIdTwo);
        dest.writeStringArray(this.videoUrls);
        dest.writeTypedList(this.videos);
        dest.writeTypedList(this.evaluates);
        dest.writeStringList(this.images);
        dest.writeTypedList(this.itemAttribute);
        dest.writeTypedList(this.itemAttributeRef);
        dest.writeTypedList(this.itemAttributeGeneral);
        dest.writeStringList(this.userLogoList);
    }

    protected ResponsePayBean(Parcel in) {
        this.body = in.readString();
        this.inventories = in.readInt();
        this.itemId = in.readString();
        this.itemName = in.readString();
        this.buyPrice = in.readString();
        this.attributeId = in.readString();
        this.id = in.readString();
        this.ids = in.readString();
        this.productId = in.readString();
        this.logoUrl = in.readString();
        this.counts = in.readString();
        this.mallPrice = in.readString();
        this.marketPrice = in.readString();
        this.saleCount = in.readString();
        this.givePoint = in.readString();
        this.isFollow = in.readString();
        this.beginTime = in.readLong();
        this.endTime = in.readLong();
        this.title = in.readString();
        this.prePurchase = in.readString();
        this.maxPurchaseNum = in.readString();
        this.remainPurchaseNum = in.readString();
        this.placeOrderNum = in.readString();
        this.minPersonNum = in.readString();
        this.remark = in.readString();
        this.remainPersonNum = in.readString();
        this.sellPrice = in.readString();
        this.productLogo = in.readString();
        this.shareUrl = in.readString();
        this.notice = in.readString();
        this.luckConfigDetailId = in.readString();
        this.luckFlag = in.readString();
        this.lotteryNum = in.readString();
        this.changePoint = in.readString();
        this.attributes = in.readString();
        this.supplierLogo = in.readString();
        this.supplierId = in.readString();
        this.supplierName = in.readString();
        this.flag = in.readString();
        this.attrValueIdOne = in.readString();
        this.attrValueIdTwo = in.readString();
        this.videoUrls = in.createStringArray();
        this.videos = in.createTypedArrayList(VideosBean.CREATOR);
        this.evaluates = in.createTypedArrayList(Evaluates.CREATOR);
        this.images = in.createStringArrayList();
        this.itemAttribute = in.createTypedArrayList(ItemAttribute.CREATOR);
        this.itemAttributeRef = in.createTypedArrayList(ItemAttributeRef.CREATOR);
        this.itemAttributeGeneral = in.createTypedArrayList(ItemAttribute.CREATOR);
        this.userLogoList = in.createStringArrayList();
    }

    public static final Creator<ResponsePayBean> CREATOR = new Creator<ResponsePayBean>() {
        @Override
        public ResponsePayBean createFromParcel(Parcel source) {
            return new ResponsePayBean(source);
        }

        @Override
        public ResponsePayBean[] newArray(int size) {
            return new ResponsePayBean[size];
        }
    };
}
