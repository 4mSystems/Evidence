package grand.app.akar.pages.onBoard.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

import grand.app.akar.model.base.StatusMessage;


public class BoardResponse extends StatusMessage {
    @SerializedName("data")
    @Expose
    private List<OnBoard> onBoardList;

    public List<OnBoard> getOnBoardList() {
        return onBoardList;
    }
}