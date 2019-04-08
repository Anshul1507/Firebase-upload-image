package kietianshub.project.com.firebaseuploadexample;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.List;

public class ImageAdapter extends RecyclerView.Adapter<ImageAdapter.ImageViewHolder> {

    private Context mContext;
    private List<Upload> mUploads;

    public ImageAdapter(Context mContext, List<Upload> mUploads) {
        this.mContext = mContext;
        this.mUploads = mUploads;
    }

    @Override
    public ImageViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(mContext).inflate(R.layout.image_item,viewGroup,false);
        return new ImageViewHolder(v);

    }
    public void onBindViewHolder(@NonNull ImageViewHolder holder, int i) {

        Upload uploadCurrent = mUploads.get(i);
        holder.textViewName.setText(uploadCurrent.getName());
        Picasso.get().load(uploadCurrent.getImageUrl())
                .fit()
                .centerCrop()
                .into(holder.imageView);

    }

    @Override
    public int getItemCount() {
        return mUploads.size();
    }

    public class ImageViewHolder extends RecyclerView.ViewHolder{

       public TextView textViewName;
       public ImageView imageView;

       public ImageViewHolder(@NonNull View itemView) {
           super(itemView);

           textViewName = itemView.findViewById(R.id.text_view_name);
           imageView = itemView.findViewById(R.id.image_view);
       }
   }
}
