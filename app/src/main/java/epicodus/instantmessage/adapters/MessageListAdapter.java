package epicodus.instantmessage.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

import java.util.ArrayList;

import epicodus.instantmessage.models.Message;

/**
 * Created by Guest on 12/7/16.
 */
public class MessageListAdapter extends RecyclerView.Adapter<MessageListAdapter.MessageViewHolder> {
    private ArrayList<Message> mMessages = new ArrayList<>();
    private Context mContext;

    public MessageListAdapter(Context context, ArrayList<Message> messages) {
        mContext = context;
        mMessages = messages;
    }

    @Override
    public MessageListAdapter.MessageViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(MessageListAdapter.MessageViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }
}
