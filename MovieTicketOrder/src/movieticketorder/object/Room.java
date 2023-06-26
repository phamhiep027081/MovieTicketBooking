/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package movieticketorder.object;

/**
 *
 * @author Admin
 */
public class Room {
    private int roomID;
    private String roomName;
    private int roomRows;
    private int roomColumns;
    private int numOfSeat;
    public Room() {}

    public Room(int roomID, String roomName, int roomRows, int roomColumns, int numOfSeat) {
        this.roomID = roomID;
        this.roomName = roomName;
        this.roomRows = roomRows;
        this.roomColumns = roomColumns;
        this.numOfSeat = numOfSeat;
    }

    public int getRoomID() {
        return roomID;
    }

    public void setRoomID(int roomID) {
        this.roomID = roomID;
    }

    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    public int getRoomRows() {
        return roomRows;
    }

    public void setRoomRows(int roomRows) {
        this.roomRows = roomRows;
    }

    public int getRoomColumns() {
        return roomColumns;
    }

    public void setRoomColumns(int roomColumns) {
        this.roomColumns = roomColumns;
    }

    public int getNumOfSeat() {
        return numOfSeat;
    }

    public void setNumOfSeat(int numOfSeat) {
        this.numOfSeat = numOfSeat;
    }

    
    
}
