package com.example.myapplication.fragments

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.Flower
import com.example.myapplication.FlowerAdapter
import com.example.myapplication.R

/**
 * Copyright 2021, White Cloak Technologies, Inc., All rights reserved.
 *
 * @author alenbrubio
 * @since 10/14/2021
 */

class ThirdFragment : Fragment(R.layout.fragment_third) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
//        val flowers = resources.getStringArray(R.array.flower_array)
        val flowers = listOf(
            Flower(
                image = "https://thumbs.dreamstime.com/z/lilac-flowers-branch-pink-background-sample-text-frame-146539832.jpg",
                title = "Lilac",
                desc = "Random Description"
            ),
            Flower(
                image = "data:image/jpeg;base64,/9j/4AAQSkZJRgABAQAAAQABAAD/2wCEAAoHCBYVFRgSFRUVGBgaGBISGhgVGBgYEhkSGBgZGRkZGBgcIS4lHB4rHxgYJjgmLC8xNTU1GiQ7QDs0Py40NTQBDAwMEA8QHxISHzQrJCs0NDQ0NjQ0NDQ2NDQ0NDQ0NDQ0NDE0NDQ0NDQ0NDQ0NDE0NDQxMTQ0NDQ0NDE0NDExMf/AABEIARMAtwMBIgACEQEDEQH/xAAbAAABBQEBAAAAAAAAAAAAAAACAAEDBAUGB//EADoQAAIBAgUCBAQEBAUFAQAAAAECAAMRBAUSITFBURMiYXEGMoGRFEKhwVJisfAVI3LR4TOCkrLxY//EABoBAAMBAQEBAAAAAAAAAAAAAAABAgMEBQb/xAAmEQACAgICAQMEAwAAAAAAAAAAAQIRAyESMUEEUWEFMkKRE6HR/9oADAMBAAIRAxEAPwD2CIQbxw0oAhHJgaoDvfaICa8UjDx9UYBxQNUa8AJIoF4gYAHFBvGLQAkjyLUYg0QEt4pHeK8ADigXjgxgHFB1RaogHYSNhCZ5GzxgEIpEanaKIAQ0O8iBi1/aMAy32igiItEARaNqg3gkxgShoWqQBoWuAE948gV4YaAEl4N4waNqiANhaMTAuI+qAEl4rwNUYtGAZaNqkZaCXgBLqgl5HqjFoAGzyNngs/QSNWiAkBiiEUAEphARgI5iGItALRzGAhYDgxiYYWMwgAN4rxERorANTDvAUQ7RgINEWitGIgFDFo2uC0AiKwol1xa5HGMdhRLqgM0C8YwsAtUWqRxRWMJzGDQGMEGKwosK0eRqYpVgWbxXmX+IaN+IaTYGrEBMwYoyRcSY7A0hBIlRcQYYqwsCYrGCwPEiFQwAsKsVpAKpheLGBLaMRIjVMbxYAEwgRGrGFSIArRiIQcR9QgBHpjESS4i2gBFaMRJdo1xACu4kd5ZcCQ6RAYSmKOLRQEP4MBqcPxYhUisABRhilJA0fXGBGUt0iBhO8jvFYEotFtB1QTUhYE1hFYSEVYeuOwDIEHSJBXxKopd2CqOWYgKPqZRpZ9hmbStZL7D5rXJ4sTsfpCy44cklai2l7I1dAiKTObNaQcUjVTWdtOoXueB7+kt6orFKEo1yTVkuiMVMDXGNSMkI3kbOYzOZC5MVhQT1yJH+IMYpG8OFjHauZE2IaSFIJWS2A61mijqsUdgIVISVJETBQ7woC74kE1ZFf+/74gGDAsCrCDyssJTACdnkRaCxjAxAECZj/FGYulMpS1az8zL8yLa9gejH7yfMM7p0G8Nw2sjUo0kK3ez8bdfcThczzhlqu+zI7HUoN9J7Bh1F7fSDaXZ6v030jnL+SS0tq+mR1MTUraab1GdV/iJbzdSB/f6yCoVtZT12JAvseSN73HS+0JhUpEMlNmBvZirXHowHB/SValOs24IUH1Rf15iUl1TPqU4JVFaXha2WUqhbeIxuTsVC2BO972v/AMztU+Jm8FGVNbW3JYgWAFmIAvfvOBw2XszKL6uoCsNOrsWF7ev6XmqhBq0sMtQG7IpCkEabhdJIOxHYWB9YoyZ5/rIYslc11/h6alTUoYcEBt+bEXhAyJm6fSEpmjPkWSQSIQMa0QDgSNpIRIKkAJFEfw5CjyYPKSRLYYQRQdX97xSqQrZWKwAP2/eXBTjeDM6Ksam4AkRTqduw6yYJYxmQncwGQgQofhxaYARtGWG6QVWICpm+VpiaZptsfmVh8yP0I/oR1E8lzfC1aDsrXVwd7Hm3DKfUWsZ7Yqzi/inNMNUbw9K1HF01gksD/CoU3Y39+sUo2j1fpueabx9xf9fs80XGPe5JJ9zf9djNE4hQt3Bbb5FIBueNRBuB7S5Wo1BUVMPSKsN9AF6zHaxqKdwLH5T6mwuDJc5NagFfEUrBjpVgqgsfzArfi0hRPSj62KuCn8FGtnb0wykKqbhVVAuqwtY/yg336yP4dx7JV/ENa4Ja7cFrdByf6SF8aaxCIhLNYAW1O3YKovOq+Hfgw1AKmIZlW5UUl2ckch26ccD7iUvYxyZseJ3KVquku7NTKPimviKy00opov8A5jjWQq83vwCeg7mdmsr4XCJTUU0RUUcKosP/AL6ywJR4eacZyuCpewawwJGDCBjMgrQHSFeImAFcJv8AUSWjtue0UcR2Kg2TUdvqYovE2A/u8UQyyEj+HDEQlCIzTgmnLEYiAFbw43hyzpjhYqAqNSgCnLpWNphQECpK7ZbT1+J4aa7Fdeka9J5F+bekv6YiIUFmfSwiINKIiDsihR+k5n49wKvQQMCQK9K49GupPuAZ2ZSc18bUwaKbbnEYZR33cf7SZdMTk0rQ+QfDlHDL5EAc3Bdt6hBJIBbptbYbbS5jcExvUpHTU5BPyPx5XHUWFr8i+01AkfRG1aobt9mVgK7vdXpujjv5kI7q42PtLuiWfDjmnBKkCZUtFLJpQfCjoZBFLHgxeFEBWIiljwYvChQEFopZCRR0BYEe0risIQrCFiosAR5AKsc1IWFEhivIDUj+JCwokZoOqct8UZtVV0w2HDa6gJ1KPNpHIQnb3PT0nGYl8RQc03eqjkXNnYAqe5VrN136TDL6hQdU2RKVeD1wOIU8hyTO3w1TxN2VrCop5YX5H8w3t7kT1OhildVZWBDAMpB2Kne47ysWZZEEZKRbnP8AxYmr8Mn8WKofZSWP9JtipMPO6l8Tg0//AEq1P/Cmx/eVN6/Q5LRvhYQEh8WLxZVlUTRGQGrBNSOwosRpX8SMavrvCx6LN4xaVS8EuYrCi0XEE1BKbOY1zFyCi2aoilQAxQ5Dog1mOtUyVqMj8GQUTpUkgeVlSWFWMVD3i1QgkfRGIiYC4NhcXANtwDzY/SQYzBJWXRURWHryPVTyD7S3pjhImr0xaOUxXwYh/wCnUZPRwHH32MqNkdbC/wCYlQugtdd1AJYX8pJsN+RvO48ODUo6lK3IuCLjkeo9ZEcMYyuKpkPGmujGwGLf85JJ4U3ZgPS3rfe9o2LdGr0apdF8NaoKEgsC4AvcHoAfvBx+RgK5DvpcXLFmepTYfmVSbMndeR09OEfLcQMSmFrG6vpqeJRJI8EsRqvyl7WuepG5nQ3GXaMXyiq7PVEYMAwIIIBBHBB3BEe0hpVlUBVFlACgDgACwEWIxDWUIvmYkAc+X+L2/ewicGuzZZE+iPFYoJtyx4Uc+57D1lFscQfO3S4C3CAe9tz6k/SaVDL9LFi177k28zH1bt6C0jTJ6Yc1SCzXuNZuq/6V4+puZUXGJLjOXwZCLiKzjQzJT2Jc7gjsgPze/A9Zv08Mq8Dfud2PueTLIEcSZSbKjBRINMXhyeMTJLK5pxwkkLQS8NDGCRRtUeGgD2jaRMjC5irDmW/xA7xBRaKiN7TJxGYWNrwFzMe3O37HuPWFAbqNDDCc++Y+sFM1gFHQkxAzLTG36whjPWAUasV5nrib8RqmII5jsKL5acU4Whmnm/6dTCsqC1wLuPIo9wdv5p0K4z1nO55UQY7CVH6Ctz8uyEgnub2sO5vIluiZKlZufh6gPkRKSaSAHcsVtsGCKLWtvbUOm43h0MVTchExCu3G2k3IG9iNu5nP/E+bOyMifIRd+hI9b9Jk/Cld3qoSbFNTtpAsV0kC5tsdx7zZWltmVx5UkelGpBNSUlxQPWF4w7zKzooueJBLyFXjPUhYUTF4xeVtcLUYASloBJgB5KhgOwLGKG1UDsP6frxFHQrPNqNWrT4395cTNqpG6n1Imx+EBkqYNbWI35uOfaTyK4nNY6pUdbkgbkgLfcHgD+Xm/WRYXEVL3YE+3Fu06Y4Ne0lXAp2EObDgYiYhztaC5cbgTbfBqIkwwj5BwMynjGA6xmxTngGbP4RYwpqI1JCcWUKGaFdm2krZiz7IpPr0+/Ekxb00sWU2JtfTdQf5u0c4ao/yUwV2szldH0F+PpNIpSVmE8jg68lemHB3KA9tW/6SnnFVvFpEIWIWogZQWUPqQgEjjZT9pqf4S4BDuB6Jci32AH2P1jo4Q2v229B1txeVwRjLJKSpmYcvesrU9OnUQWdjvp/NpXueNxsJI2Feimmko0gDUVN3Pv3mkcSLab829/QRNVAB/breU4omE6ekc6mbuDDGeuDuDLLYRb3sBK9fCrMOUTv4s0cPnwtuY9X4gTvMNsKIhhVtFcWFM6bC50h6iTVc6TuJxj4e3B+0iaie8OUQpnXnPE7y3h80VgTqHG9+h9fScTh6N+bEb3vxv1+m8ko0mW4BJHAJ5MOSQqbNXNc+CG2ra8U57HZczm5vGhyQ+LOtOYr0MTZoO84hsUwNrmXEpuwvMi7s6j/E17w6eZAzkzTfubzUylDe5iugk6WjoXqta8otj9JsZointcGYeZ0fNf8AsxKVmcclsttmgEqvm3rM98OTLOWUhTbxGTWwBCqR5Ln8zH77WjvZr4ssDH61KaSwPIAvLeFzZk2dHHQaFNiP9JPMSZnXHyBEH8KIoU+/UmA+OxLG/isPRQoH9LzSM1HpmM8bm9osYjMmcItNHBckAvtptzt7b3PSYWd1RTxWGsRUISuGUG63IUD6Dm/pLGIpvYs7O4JDNqYsdtgd/fiZ2Jww/FYYDhkrkfYQeRvbIeJRVfKv5JWqG/HW9gSAPYXk4xbmwvsBa1t+e/1M0Uy7uJYTLvSZ8pPtnRwiukZGtzBKP6zoEy+3ST/ghCmWcyKDGSLgW9Z0aYHfiWkwVukag/BLml2csmXGRVsqY8XnXPQA6Q6dEEcSlCnslytaOTweUkczXpZcLcTQdVELxgBeW4pohSplD/Dx2ilpsao6xSdGmzhc0yY/MJuZHgtYAfaGcwRxyIqWYKm94oU+zKUkto0cVk6WuBKNDDaTHrfEanyjeNSxWrePKkujOOVdFwG+w2jPhNW8gbEgSxTxq25nPjlHaY4ySkJcEO0kXBiQnGQmxlprSOhSTLC4UR2w6zNqZoF6yu+cjvCirNoUVtYgEcWPac5mVLRjsJb5LVkHoSvF/tJf8aEzM/x+oUqg5p1Uf6HY/tF5sxyrV+x3GHo6uLdpbXDHpYntOKX4gembpY91b5T/ALH1m5hc8LqHKVEbYDyFla520sBY/pN4KElXkznPJF34L+JfQbEWi8dFALEX7evYdzMX4hzKsFUaKirq1amA8zDgbbAe+/pKWFz9rXaiGc3JbWVvfm3lJHteNOEZUwlLJKKcTpDXdzZQqD+e4Yj/AEjf72gu6p53cn/U2lfXy7frec/iM9rHdQF9yXPvvsPtMzEVKtY3di29xe1geNgNhKlnjHSIj6eUts3K2aIXDqWB33BZVN/QHf6y2mZ7czmaeAY95q4XKb2vc+8x5uTtnQoKKpG/gED7neR5yllIWS4a6CwWR4irqNmmjao53KpHJuX7mKdG2BVukUx4s6lJUcRjsudDdSf2lWtTqbbmdbm5AaxsRMSpiF1BbdZlxUZHCpUSYDANsbTWp4e24kmFKsBpax7Sx44XkAzojFSFdmdiKhHJg4Qg9drzPzvHAmwh5YrNyJyZYqMqC7N3QGjVaBItIVqFDvtNHDYhG5Ihjm74lxk+jFrYIjci8FsCCOJ0dFUb8pPPJP8AQQqhVRYKB2sP37zuWN1sp50tHH1cuPQGUsTg2ZHBH5Tt6jedc/mewFwLgsP4hbaRNRHmBB2uCRxxwD1Myljd6Nlli4b8mf8ACWGSogqsFZvl8+4BW17L+Y/89p05qEmwbg7bA39P7M534TwuvDL4Vx5qpAaxbTrawJFhNujgmuNbWUi5A+cn2ItadGLjWjjm5asoZtWdho6E7gE2+xPEo0cHfpOjbC0ACbsT1Oq5/wCBKi1kA2+l9jaRljbs2xdUivh8sB+aaS5egHyiVHzJV4Ilapng6tM9I6EpM01wqiT02C9pgrnGrZZcp1r7kxJ7HKUUtm7p1DpMzF0SpvtIjmip13lHG5rq2E1fGtnFJ3LRdTHAbXAinN1NTtzFMXkSN0tFXMMwDbcGZeDqBn36SDMELi6ypgahQlzuwIUX43BNz9pNcnbOVI79LIoY2Bt+nr2lTEZugBJIPTy9+28qYRw6DWxOoX54vMWtljFmZQWFypAvpIv17TdquhvXQ61BUqEji+063L3VV3nGYDDlKhC3Kg7dvvOsw9DV820xnUnQaokxNU1W8OmNbkHyjsOpJ2EoYDLMYHP+UQL763QAe2+82BijSUrSVdFgb8MzdST1nLZznVZwV16RuNKbXHqef6cxrDBbb38CTd2jrVx/hDSzI7DbRTvUdWvwwFgPcsJPRzF3trplQTY3IUe7btYexM8++HyyNe5sebztvxwKc9JrGbYavZLjMxo0NlIY7gHfw1/7upPvv6Sg+bXVje/lbntboOgkBoeJ0Nut42My7RScIu+hrDoRbf22kyk30bx4xjoD4Wxjphk8MgN5zY/KwLsbHt7zp/xzFVbRd9gVO+/UWG32nP8AwxRUYemBudNjfcHck3sbafWbK5iyLdFUMeNfzBelwtvtJjOtXSMqvZHiRXqkIUKJfopF/cm8kOVra2tQf5m3+0X4mtU3Z9I/lVQfuQTAp4Sle+jUxvu7M/8A7Eibcovb2aR5JUqRhZtlbi5SpTcc2V/P9jzMqlkVZ97kD1neUsvUm5UAdrWEvtWpItzYASHFPfRSnJabOFp4VqI8wlzDYp3+UfeRZ3mas21rdJXwOYqNri8yUFdic1ey9iaLctxMtVLGwJAHJ3+3vNPE19YsDzYShlA1uQTYL0689fWZudSoylkt6NfA4YKORf6j+saWcTRIA03N+na0U04ofNnEfiQo42mdXdal1U2JKkHpcX8p7A3/AEmjgcXTZdwPWUsXQQPqQ7dpo48VaF0Xskd7ikxK7kWsLjqbX4mziCCPDpmwtzfmc3UxR0WFgbWv+a3a/aZuHzJ0cb/7WiU1JCv2OswWBZCb7gm/tL1fHAKU3NwRt0vtI8DmIZL2F5k5lixqvOeS5S0wo2XrlxYH7TPxOTs3mJtJcse29xDzPNdC9jNYwaQIo00CGwmrhqwNgw2nOZXmHi1NJ5v9J29LKgVBlKLbG4pkiMqjb7zKxOIZ2amSdJFjyGAO1x3HpNZMr6XNuxMWIy4Dcnfv1PbeOUWoug5UZvwmwagzfKUd6dj1e97D0A3Al+ooHW0wMmbRWxNLotQVB7uu5h5pj2UbTilyUtByNDEZkUuFNz2lzKMWTYuDv3mTkeIVxdrXmliWN/Ip9524oSrlJl8rOmqHUuxnN5jRN7E7QlzTSNzKtXF6/MDf0mr2JpmJWwoZ9O1+s08FlqAXNtpjZmjhgQNzxaX8Nldd18z2HYHf7yJJ9JGbvwHj8Uq7C2xG314lBcV4Ta1OxvuP1B9YeLwBp82I9Tc3mU9SxO4N+VPHpOeUWuuxfB12HzoBQ5uzMAQNtl/aNMChXVRqY7mKWpSoNnLZbuJbwvzt94opuujXwFU5EDEoLcRRTCPkiBZwDkJzHxW5EUUyh97KXZqYbiUKnmJ1b+8UU6I/cLyHllMKwIFj3nouAqHRzGimnkH2HTqEk3N5UzWodPMUUcvtFI5PLHP4mvv+VJdzBARuIopw/mJ9CyRALm008Q5A56RRTu/EuHaOdxtQ6eZp5T8kUUcTSfZVxrnxVF+onT03ITnpFFFIyOSz6ob8zncNu++8eKc/5ER7LOPbYCKKKWWf/9k=",
                title = "Rose",
                desc = "Random Description"
            ),
            Flower(
                image = null,
                title = "asd",
                desc = "Random Description"
            ),
            Flower(
                image = null,
                title = "asddasd",
                desc = "Random Description"
            ),
        )

        val rcv = getView()?.findViewById<RecyclerView>(R.id.rcv)
        rcv?.adapter = FlowerAdapter(requireContext(), flowers)
    }
}