package kr.or.ddit.widu.service.shop;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;
import java.util.Map;

import kr.or.ddit.widu.vo.shop.Shop_ItemVO;
import kr.or.ddit.widu.vo.shop.Shop_RubbyVO;

public interface IShopService extends Remote {
	/**
	 * DB에 있는 아이템 데이터를 불러오는 메소드
	 * @return Shop_ItemVO에 있는 모든 데이터
	 */
	public List<Shop_ItemVO> selectAllItems(Map<String, String> params) throws RemoteException;
	
	public int insertItem(Shop_ItemVO itemInfo) throws RemoteException;
	
	public int modifyItem(Shop_ItemVO itemInfo) throws RemoteException;
	
	public int deleteItem(Map<String, String> params) throws RemoteException;
	
	public List<Shop_RubbyVO> rubyselectallitems(Map<String, String> params) throws RemoteException;
	
	public int rubyinsertItem(Shop_RubbyVO rubyInfo) throws RemoteException;
	
	public int rubymodifyItem(Shop_RubbyVO rubyInfo) throws RemoteException;
	
	public int rubydeleteItem(Map<String, String> params) throws RemoteException;
	
	public List<Shop_ItemVO> newItemList() throws RemoteException;
	
	public List<Shop_ItemVO> popularItemList() throws RemoteException;
	
	public Shop_ItemVO itemInfo(Map<String, String> params) throws RemoteException;
}
